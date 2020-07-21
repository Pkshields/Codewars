package kyu5

object RemovedNumbers {
    fun removNb(n: Long): Array<LongArray> {
        val sumOfSequence = (n * (n+1)) / 2
        return (1..n).mapNotNull { a ->
            val b = (sumOfSequence - a) / (a + 1.0)
            if (b > 0 && b < n && b.isRoundNumber()) {
                longArrayOf(a, b.toLong())
            } else {
                null
            }
        }.toTypedArray()
    }

    private fun Double.isRoundNumber() = this - this.toLong() == 0.0


    /**  Nicer solution, but timed out CodeWars **/
//    fun removNb(n: Long): Array<LongArray> {
//        val sumOfSequence = (n * (n+1)) / 2
//        return (1..n)
//            .map { a -> Pair(a, calculateB(a, sumOfSequence)) }
//            .filter { (_, b) -> b > 0 && b < n && b.isRoundNumber() }
//            .map { (a, b) -> longArrayOf(a, b.toLong()) }
//            .toTypedArray()
//    }
//
//    private fun calculateB(a: Long, sumOfSequence: Long) = (sumOfSequence - a) / (a + 1.0)
//    private fun Double.isRoundNumber() = this - this.toLong() == 0.0
}

/**
 * URL: https://www.codewars.com/kata/is-my-friend-cheating/train/kotlin
 *
 * ab = (n(n+1)/2) - a - b
 * ab + b = sum - a
 * b(a+1) = sum - a
 * b = sum - a / a + 1
 */
