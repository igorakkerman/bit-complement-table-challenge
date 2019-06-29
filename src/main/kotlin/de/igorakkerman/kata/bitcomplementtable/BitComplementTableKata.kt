package de.igorakkerman.kata.bitcomplementtable

class BitComplementTableKata {
    fun maxRowsWithOnly0or1AfterColumnsComplement(a: Array<IntArray>): Int {

        val counts = mutableMapOf<List<Int>, Int>()

        a.forEach {
            val l = it.toList()
            counts[l] = (counts[l] ?: 0) + 1
        }

        return counts.asSequence().map { it.value + (counts[it.key.map { bit -> bit xor 1 }] ?: 0) }.max()!!
    }
}
