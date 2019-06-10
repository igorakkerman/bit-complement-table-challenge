package de.igorakkerman.kata.xyz

import java.math.BigInteger
import java.math.BigInteger.*

class XyzKata {

    fun solution(a: Array<IntArray>): Int {

        val rowValues = asNumbers(a)

        val allZeros = ZERO
        val allOnes = TWO.pow(a[0].size) - ONE

//        println(allOnes)

//        var count = 0

        return generateSequence(allZeros, { v: BigInteger -> if (v != allOnes) v.inc() else null })
            .map { mask ->
                rowValues
                    .asSequence()
//                    .onEach { if (++ count % 100000 == 0) println(count) }
                    .map { it xor mask }
                    .filter { it == allZeros || it == allOnes }
                    .count()
            }
            .max()!!
    }

    internal fun asNumbers(a: Array<IntArray>): List<BigInteger> {
        return a.map { rowCells ->
            rowCells
                .map { valueOf(it.toLong()) }
                .reduce { x: BigInteger, y: BigInteger -> TWO.times(x).plus(y) }
        }
    }
}
