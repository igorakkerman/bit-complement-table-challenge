package de.igorakkerman.kata.xyz

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

internal class XyzKataTest {

    val kata = XyzKata()

    @Test
    internal fun `1x1`() {
        assertThat(kata.solution(arrayOf(intArrayOf(1))))
            .isEqualTo(1)
    }

    @Test
    internal fun `2x1 (0 0)`() {
        val a = arrayOf(
                intArrayOf(0),
                intArrayOf(0)
        )

        assertThat(kata.solution(a))
            .isEqualTo(2)
    }

    @Test
    internal fun `2x1 (1 1)`() {
        val a = arrayOf(
                intArrayOf(1),
                intArrayOf(1)
        )
        assertThat(kata.solution(a))
            .isEqualTo(2)
    }

    @Test
    internal fun `2x1 (0 1)`() {
        val a = arrayOf(
                intArrayOf(0),
                intArrayOf(1)
        )
        assertThat(kata.solution(a))
            .isEqualTo(2)
    }

    @Test
    internal fun `2x1 (1 0)`() {
        val a = arrayOf(
                intArrayOf(1),
                intArrayOf(0)
        )
        assertThat(kata.solution(a))
            .isEqualTo(2)
    }

    @Test
    internal fun `1x2 (0 0)`() {
        val a = arrayOf(
                intArrayOf(0, 0)
        )
        assertThat(kata.solution(a))
            .isEqualTo(1)
    }

    @Test
    internal fun `1x2 (1 1)`() {
        val a = arrayOf(
                intArrayOf(1, 1)
        )
        assertThat(kata.solution(a))
            .isEqualTo(1)
    }

    @Test
    internal fun `1x2 (0 1)`() {
        val a = arrayOf(
                intArrayOf(0, 1)
        )
        assertThat(kata.solution(a))
            .isEqualTo(1)
    }

    @Test
    internal fun `1x2 (1 0)`() {
        val a = arrayOf(
                intArrayOf(1, 0)
        )
        assertThat(kata.solution(a))
            .isEqualTo(1)
    }

    @Test
    internal fun `3x4 - swap col 2,3 - rows 2,3`() {
        val a = arrayOf(
                intArrayOf(1, 0, 0, 1),
                intArrayOf(0, 1, 1, 0),
                intArrayOf(1, 1, 0, 0)
        )
        assertThat(kata.solution(a))
            .isEqualTo(2)
    }

    @Test
    internal fun `3x4 - swap 2,3,4 - row 1`() {
        val a = arrayOf(
                intArrayOf(1, 0, 0, 0),
                intArrayOf(0, 1, 0, 0),
                intArrayOf(0, 0, 1, 0)
        )
        assertThat(kata.solution(a))
            .isEqualTo(1)
    }

    @Test
    internal fun `3x4 - swap 1,3,4 - rows 2,3`() {
        val a = arrayOf(
                intArrayOf(0, 0, 0, 0),
                intArrayOf(0, 1, 0, 0),
                intArrayOf(1, 0, 1, 1)
        )
        assertThat(kata.solution(a))
            .isEqualTo(2)
    }

    @Test
    internal fun `4x4 - swap 1,2,3,4 - rows 1,2,3,4`() {
        val a = arrayOf(
                intArrayOf(0, 1, 0, 1),
                intArrayOf(1, 0, 1, 0),
                intArrayOf(0, 1, 0, 1),
                intArrayOf(1, 0, 1, 0)
        )
        assertThat(kata.solution(a))
            .isEqualTo(4)
    }

    @Nested
    inner class AllOnes {
        @Test
        internal fun `allOnes 0`() {
            assertThat(kata.allOnes(0))
                .isEqualTo(0)
        }

        @Test
        internal fun `allOnes 1`() {
            assertThat(kata.allOnes(1))
                .isEqualTo(1)
        }

        @Test
        internal fun `allOnes 2`() {
            assertThat(kata.allOnes(2))
                .isEqualTo(3)
        }
    }

    @Nested
    inner class AsNumbers {

        @Test
        internal fun `asNumbers (0)`() {
            val a = arrayOf(
                    intArrayOf(0)
            )
            assertThat(kata.asNumbers(a))
                .containsExactly(0)
        }

        @Test
        internal fun `asNumbers (0, 1)`() {
            val a = arrayOf(
                    intArrayOf(0, 1)
            )
            assertThat(kata.asNumbers(a))
                .containsExactly(1)
        }

        @Test
        internal fun `asNumbers (1, 0)`() {
            val a = arrayOf(
                    intArrayOf(1, 0)
            )
            assertThat(kata.asNumbers(a))
                .containsExactly(2)
        }

        @Test
        internal fun `asNumbers (1, 1, 0)`() {
            val a = arrayOf(
                    intArrayOf(1, 1, 0)
            )
            assertThat(kata.asNumbers(a))
                .containsExactly(6)
        }

        @Test
        internal fun `asNumbers ((0), (1))`() {
            val a = arrayOf(
                    intArrayOf(0),
                    intArrayOf(1)
            )
            assertThat(kata.asNumbers(a))
                .containsExactly(0, 1)
        }

        @Test
        internal fun `asNumbers ((0,1), (1,0))`() {
            val a = arrayOf(
                    intArrayOf(0, 1),
                    intArrayOf(1, 0)
            )
            assertThat(kata.asNumbers(a))
                .containsExactly(1, 2)
        }

        @Test
        internal fun `asNumbers ((1, 1, 0),(0,1,0))`() {
            val a = arrayOf(
                    intArrayOf(1, 1, 0),
                    intArrayOf(0, 1, 0)
            )
            assertThat(kata.asNumbers(a))
                .containsExactly(6, 2)
        }

    }
}