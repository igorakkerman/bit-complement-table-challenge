package de.igorakkerman.kata.xyz

import java.math.BigInteger
import java.math.BigInteger.ONE

class XyzKata {

    private val TWO = BigInteger.valueOf(2)

    fun solution(a: Array<IntArray>): Int {

        val counts = mutableMapOf<BigInteger, Int>()
        val allOnes = TWO.pow(a[0].size) - ONE

        for (rowValue in asNumbers(a))
            counts[rowValue] = (counts[rowValue] ?: 0) + 1

        return counts.asSequence().map { it.value + (counts[allOnes.xor(it.key)] ?: 0) }.max()!!
    }

    internal fun asNumbers(a: Array<IntArray>): List<BigInteger> {
        return a.map { rowCells ->
            rowCells
                .map { BigInteger.valueOf(it.toLong()) }
                .reduce { x: BigInteger, y: BigInteger -> TWO.times(x).plus(y) }
        }
    }
}
