package kyu5

fun orderWeight(string: String) = string
    .split(" ")
    .filter { it.isNotEmpty() }
    .sorted()
    .sortedBy { weightOfNumber(it) }
    .joinToString(separator = " ")

private fun weightOfNumber(input: String) = input
    .map(Character::getNumericValue)
    .sum()

/**
 * URL: https://www.codewars.com/kata/weight-for-weight/kotlin
 */