package de.igorakkerman.challenge.bitcomplementtable

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BitComplementTablechallengeTest {

    private val challenge = BitComplementTablechallenge()

    @Test
    internal fun `1x1`() {
        assertThat(challenge.maxRowsWithOnly0or1AfterColumnsComplement(arrayOf(intArrayOf(1))))
            .isEqualTo(1)
    }

    @Test
    internal fun `2x1 (0 0)`() {
        val a = arrayOf(
                intArrayOf(0),
                intArrayOf(0)
        )

        assertThat(challenge.maxRowsWithOnly0or1AfterColumnsComplement(a))
            .isEqualTo(2)
    }

    @Test
    internal fun `2x1 (1 1)`() {
        val a = arrayOf(
                intArrayOf(1),
                intArrayOf(1)
        )
        assertThat(challenge.maxRowsWithOnly0or1AfterColumnsComplement(a))
            .isEqualTo(2)
    }

    @Test
    internal fun `2x1 (0 1)`() {
        val a = arrayOf(
                intArrayOf(0),
                intArrayOf(1)
        )
        assertThat(challenge.maxRowsWithOnly0or1AfterColumnsComplement(a))
            .isEqualTo(2)
    }

    @Test
    internal fun `2x1 (1 0)`() {
        val a = arrayOf(
                intArrayOf(1),
                intArrayOf(0)
        )
        assertThat(challenge.maxRowsWithOnly0or1AfterColumnsComplement(a))
            .isEqualTo(2)
    }

    @Test
    internal fun `1x2 (0 0)`() {
        val a = arrayOf(
                intArrayOf(0, 0)
        )
        assertThat(challenge.maxRowsWithOnly0or1AfterColumnsComplement(a))
            .isEqualTo(1)
    }

    @Test
    internal fun `1x2 (1 1)`() {
        val a = arrayOf(
                intArrayOf(1, 1)
        )
        assertThat(challenge.maxRowsWithOnly0or1AfterColumnsComplement(a))
            .isEqualTo(1)
    }

    @Test
    internal fun `1x2 (0 1)`() {
        val a = arrayOf(
                intArrayOf(0, 1)
        )
        assertThat(challenge.maxRowsWithOnly0or1AfterColumnsComplement(a))
            .isEqualTo(1)
    }

    @Test
    internal fun `1x2 (1 0)`() {
        val a = arrayOf(
                intArrayOf(1, 0)
        )
        assertThat(challenge.maxRowsWithOnly0or1AfterColumnsComplement(a))
            .isEqualTo(1)
    }

    @Test
    internal fun `3x4 - swap col 2,3 - rows 2,3`() {
        val a = arrayOf(
                intArrayOf(1, 0, 0, 1),
                intArrayOf(0, 1, 1, 0),
                intArrayOf(1, 1, 0, 0)
        )
        assertThat(challenge.maxRowsWithOnly0or1AfterColumnsComplement(a))
            .isEqualTo(2)
    }

    @Test
    internal fun `3x4 - swap 2,3,4 - row 1`() {
        val a = arrayOf(
                intArrayOf(1, 0, 0, 0),
                intArrayOf(0, 1, 0, 0),
                intArrayOf(0, 0, 1, 0)
        )
        assertThat(challenge.maxRowsWithOnly0or1AfterColumnsComplement(a))
            .isEqualTo(1)
    }

    @Test
    internal fun `3x4 - swap 1,3,4 - rows 2,3`() {
        val a = arrayOf(
                intArrayOf(0, 0, 0, 0),
                intArrayOf(0, 1, 0, 0),
                intArrayOf(1, 0, 1, 1)
        )
        assertThat(challenge.maxRowsWithOnly0or1AfterColumnsComplement(a))
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
        assertThat(challenge.maxRowsWithOnly0or1AfterColumnsComplement(a))
            .isEqualTo(4)
    }

    @Test
    internal fun `1000 x 100 - diagonal ones`() {

        val a = Array(1_000) { row ->
            IntArray(100) { column -> if (column == row) 1 else 0 }
        }

        assertThat(challenge.maxRowsWithOnly0or1AfterColumnsComplement(a))
            .isEqualTo(900)
    }

    @Test
    internal fun `1 x 100_000 - diagonal ones`() {

        val a = arrayOf(
            IntArray(100_000) { it % 2 }
        )

        assertThat(challenge.maxRowsWithOnly0or1AfterColumnsComplement(a))
            .isEqualTo(1)
    }

    @Test
    internal fun `100_000 x 1 - diagonal ones`() {

        val a = Array(100_000) {
            intArrayOf(it % 2)
        }

        assertThat(challenge.maxRowsWithOnly0or1AfterColumnsComplement(a))
            .isEqualTo(100_000)
    }
}
