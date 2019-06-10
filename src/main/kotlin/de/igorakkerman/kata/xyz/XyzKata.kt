package de.igorakkerman.kata.xyz

import kotlin.math.pow

class XyzKata {

    fun solution(a: Array<IntArray>): Int {

        val rows = asNumbers(a)

        val allZeros = 0
        val allOnes = allOnes(bitsCount = a[0].size)

        return (allZeros..allOnes)
            .map { mask ->
                rows.map { row -> row xor mask }
                    .filter { row -> row.equals(allZeros) || row.equals(allOnes) }
                    .count()
            }
            .max()!!
    }

    internal fun asNumbers(a: Array<IntArray>): List<Int> {
        return a.map { row ->
            row.reduce { x, y -> x * 2 + y }
        }
    }

    internal fun allOnes(bitsCount: Int): Int =
        (2.toDouble().pow(bitsCount) - 1).toInt()
}