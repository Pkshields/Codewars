package kyu5

import java.math.BigInteger

fun lastDigit(base: BigInteger, exponent: BigInteger): Int {
    if (exponent == 0.toBigInteger()) return 1

    val lastBaseDigit = base.mod(10)

    return when (lastBaseDigit) {
        2 -> listOf(6, 2, 4, 8)[exponent.mod(4)]
        3 -> listOf(1, 3, 9, 7)[exponent.mod(4)]
        4 -> listOf(6, 4, 6, 4)[exponent.mod(4)]
        7 -> listOf(1, 7, 9, 3)[exponent.mod(4)]
        8 -> listOf(6, 8, 4, 2)[exponent.mod(4)]
        9 -> listOf(1, 9, 1, 9)[exponent.mod(4)]
        else -> lastBaseDigit
    }
}

fun BigInteger.mod(int: Int): Int = this.mod(int.toBigInteger()).toInt()

/**
 * URL: https://www.codewars.com/kata/last-digit-of-a-large-number/kotlin
 *
 * Working out...
 *
 * 1^ = 1
 * 2^ = 2, 4, 8, 6...
 * 3^ = 3, 9, 7, 1...
 * 4^ = 4, 6...
 * 5^ = 5
 * 6^ = 6
 * 7^ = 7, 9, 3, 1
 * 8^ = 8, 4, 2, 6
 * 9^ = 9, 1
 */