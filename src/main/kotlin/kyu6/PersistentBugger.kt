package kyu6

fun persistence(num: Int): Int = when {
    num < 10 -> 0
    else -> persistence(num.multiplicativePersistence()) + 1
}

fun Int.multiplicativePersistence(): Int = when {
    this == 0 -> 1
    else -> this % 10 * (this / 10).multiplicativePersistence()
}

/**
 * URL: https://www.codewars.com/kata/persistent-bugger/kotlin
 */