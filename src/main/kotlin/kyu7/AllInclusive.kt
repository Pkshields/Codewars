package kyu7

fun containAllRots(strng: String, arr: ArrayList<String>): Boolean {
    var testString = strng

    do {
        if (!arr.contains(testString)) {
            return false
        }
        testString = testString.rotate()
    } while (testString != strng)

    return true
}

fun String.rotate(): String {
    return substring(1, length) + this[0]
}

/**
 * URL: https://www.codewars.com/kata/all-inclusive/kotlin
 */