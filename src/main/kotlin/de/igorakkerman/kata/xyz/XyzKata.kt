package de.igorakkerman.kata.xyz

class XyzKata {
    fun solution(a: Array<IntArray>): Int {

        val counts = mutableMapOf<List<Int>, Int>()

        a.forEach {
            val l = it.toList()
            counts[l] = (counts[l] ?: 0) + 1
        }

        return counts.asSequence().map { it.value + (counts[it.key.map { bit -> bit xor 1 }] ?: 0) }.max()!!
    }
}
