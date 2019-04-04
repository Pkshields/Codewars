package kyu5

fun incrementString(str: String) =
    str.split("([a-zA-Z]+)?([0-9]+)?")?.let {
        val number = it[1].toIntOrZero() + 1
        val numberAsString = number.toString().padStart(it[1].count(), '0')
        "${it[0]}$numberAsString"
    } ?: ""

fun String.split(regex: String) = Regex(regex).find(this)?.groupValues?.let { it.subList(1, it.count()) }
fun String.toIntOrZero() = this.toIntOrNull() ?: 0

/**
 * URL: https://www.codewars.com/kata/string-incrementer/kotlin
 */