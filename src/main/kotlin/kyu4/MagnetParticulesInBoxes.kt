package kyu4

import kotlin.math.pow

private fun v(k: Int, n: Int) = 1.0 / (k * (n + 1).toDouble().pow(k * 2))

private fun u(k: Int, maxN: Int) = (1..maxN).sumOf { v(k, it) }

fun doubles(maxK: Int, maxN: Int) = (1..maxK).sumOf { u(it, maxN) }

/**
 * URL: https://www.codewars.com/kata/magnet-particules-in-boxes/kotlin
 */
