package kyu6

fun sumConsecutives(input: List<Int>) = input
    .zipWithNext()
    .fold(mutableListOf(input[0]), { collector, value ->
        if (value.first == value.second) {
            collector[collector.lastIndex] += value.first
        } else {
            collector.add(value.second)
        }
        collector
    })

/**
 * URL: https://www.codewars.com/kata/sum-consecutives/kotlin
 */
