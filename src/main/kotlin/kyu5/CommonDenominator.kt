package kyu5

object Fracts {
    fun convertFrac(list: Array<LongArray>): String {
        val reducedFractions = handleReducibleFractions(list)
        val denominators = reducedFractions.map { it[1] }
        val lowestCommonDenominator = calculateLowestCommonDenominator(denominators)
        return applyCommonDenominatorToFractions(reducedFractions, lowestCommonDenominator)
            .joinToString("") { "(${it[0]},${it[1]})" }
    }

    private fun handleReducibleFractions(list: Array<LongArray>) =
        list.map { fraction ->
            val divisor = greatestCommonDivisor(fraction[0], fraction[1])
            fraction.map { it / divisor }.toLongArray()
        }

    private fun greatestCommonDivisor(a: Long, b: Long): Long {
        if (b == 0L) return a
        return greatestCommonDivisor(b, a % b)
    }

    private fun calculateLowestCommonDenominator(denominators: List<Long>): Long {
        val largestDenominator = denominators.max() ?: 0
        return generateSequence(1) { it + 1 }
            .map { largestDenominator * it }
            .first { potentialDenominator -> denominators.all { potentialDenominator % it == 0L } }
    }

    private fun applyCommonDenominatorToFractions(fractions: List<LongArray>, lowestCommonDenominator: Long) =
        fractions.map {
            val multiplier = lowestCommonDenominator / it[1]
            longArrayOf(it[0] * multiplier, lowestCommonDenominator)
        }
}