package kyu7

fun findShort(s: String) = s.split(" ").map { it.length }.sorted().first()

/**
 * URL: https://www.codewars.com/kata/shortest-word/kotlin
 */