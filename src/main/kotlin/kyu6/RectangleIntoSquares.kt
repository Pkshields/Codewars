package kyu6

fun sqInRect(lng: Int, wdth: Int):List<Int>? {
    if (lng == wdth) return null
    return squaresInRectangle(lng, wdth).toList()
}

fun squaresInRectangle(lng: Int, wdth: Int): Sequence<Int> {
    var width = wdth
    var height = lng

    return generateSequence {
        when {
            height == 0 -> null
            width <= height -> {
                height -= width
                width
            }
            else -> {
                width -= height
                height
            }
        }
    }
}

/**
 * URL: https://www.codewars.com/kata/rectangle-into-squares/kotlin
 */