package de.igorakkerman.kata.bitcomplementtable

class BitComplementTableKata {
    fun maxRowsWithOnly0or1AfterColumnsComplement(a: Array<IntArray>): Int {

        val counts = mutableMapOf<List<Int>, Int>()

        a.forEach {
            val l = it.toList()
            counts[l] = (counts[l] ?: 0) + 1
        }

        return counts.asSequence().map { it.value + (counts[complementOf(row = it.key)] ?: 0) }.max()!!
    }

    private fun complementOf(row: List<Int>) = row.map { bit -> bit xor 1 }
}
