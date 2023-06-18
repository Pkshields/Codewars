package kyu5

import java.math.BigInteger

object SumFct {
    fun perimeter(n: Int) =
        fibonacciSequenceGenerator()
            .take(n + 1)
            .sumOf { it } * BigInteger.valueOf(4)

    private fun fibonacciSequenceGenerator() =
        generateSequence(BigInteger.ZERO to BigInteger.ONE) { it.second to it.first + it.second }
        .map { it.second }  // The 0 is dropped ignored purposefully
}

/**
 * URL: https://www.codewars.com/kata/559a28007caad2ac4e000083/train/kotlin
 */
