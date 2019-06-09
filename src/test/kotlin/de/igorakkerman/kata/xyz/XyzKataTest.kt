package de.igorakkerman.kata.xyz

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class XyzKataTest {

    val kata = XyzKata()

    @Test
    internal fun empty() {
        assertThat(kata.solution(IntArray(0)))
                .isEqualTo(0)
    }

    @Test
    internal fun `single char`() {
        assertThat(kata.solution(intArrayOf(1)))
                .isEqualTo(0)
    }

    @Test
    internal fun `sequence of numbers`() {
        assertThat(kata.solution(intArrayOf(1, 2, 3, 4, 5)))
                .isEqualTo(0)
    }
}