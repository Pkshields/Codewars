package kyu4

fun decodeBits(bits: String): String = bits.trim('0').let {
    val timeUnit = calculateTimeUnit(it)
    return decodeBits(it, timeUnit)
}

private fun calculateTimeUnit(bits: String) =
    bits.splitWhenCharChanges().map { it.length }.min() ?: 0

private fun String.splitWhenCharChanges(): List<String> =
    this.fold(mutableListOf()) { result, char ->
        if (result.lastOrNull()?.first() == char) {
            result[result.lastIndex] += char.toString()
        } else {
            result.add(char.toString())
        }
        result
    }

private fun decodeBits(bits: String, timeUnit: Int) =
    bits.replace("0000000".repeat(timeUnit), "   ")
        .replace("000".repeat(timeUnit), " ")
        .replace("111".repeat(timeUnit), "-")
        .replace("1".repeat(timeUnit), ".")
        .replace("0".repeat(timeUnit), "")

fun decodeMorse(code: String) = code.trim()
    .split("   ")
    .joinToString(separator = " ") { morseWord ->
        morseWord.split(" ")
            .map { MORSE_CODE[it] }
            .joinToString(separator = "")
    }

/**
 * URL: https://www.codewars.com/kata/54b72c16cd7f5154e9000457/kotlin
 *
 * Any Kotlin specific changes that could have been made by the IDE have been lst as is,
 * due to the kata being written in Kotlin 1.3
 */

private val MORSE_CODE = mapOf(
    "-.-.--" to "!",
    ".-..-." to "\"",
    "...-..-" to "$",
    ".-..." to "&",
    ".----." to "'",
    "-.--." to "(",
    "-.--.-" to ")",
    ".-.-." to "+",
    "--..--" to ",",
    "-....-" to "-",
    ".-.-.-" to ".",
    "-..-." to "/",
    "-----" to "0",
    ".----" to "1",
    "..---" to "2",
    "...--" to "3",
    "....-" to "4",
    "....." to "5",
    "-...." to "6",
    "--..." to "7",
    "---.." to "8",
    "----." to "9",
    "---..." to ":",
    "-.-.-." to ";",
    "-...-" to "=",
    " ..--.." to "?",
    ".--.-." to "@",
    ".-" to "A",
    "-..." to "B",
    "-.-." to "C",
    "-.." to "D",
    "." to "E",
    "..-." to "F",
    "--." to "G",
    "...." to "H",
    ".." to "I",
    ".---" to "J",
    "-.-" to "K",
    ".-.." to "L",
    "--" to "M",
    "-." to "N",
    "---" to "O",
    ".--." to "P",
    "--.-" to "Q",
    ".-." to "R",
    "..." to "S",
    "-" to "T",
    "..-" to "U",
    "...-" to "V",
    ".--" to "W",
    "-..-" to "X",
    "-.--" to "Y",
    "--.." to "Z",
    "..--.-" to "_",
    "...---..." to "SOS")
