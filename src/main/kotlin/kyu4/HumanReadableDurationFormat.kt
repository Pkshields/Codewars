package kyu4

object TimeFormatter {
    fun formatDuration(input: Int): String {
        if (input == 0) return "now"
        return listOf(
            (input / 31536000).toStringWithUnits("year"),
            (input / 86400 % 365).toStringWithUnits("day"),
            (input / 3600 % 24).toStringWithUnits("hour"),
            (input / 60 % 60).toStringWithUnits("minute"),
            (input % 60).toStringWithUnits("second"))
            .filter { it.first() != '0' }
            .joinToString(", ")
            .replaceLast(",", " and")
    }

    private fun Int.toStringWithUnits(timeUnit: String) = when (this) {
        1 -> "$this $timeUnit"
        else -> "$this ${timeUnit}s"
    }

    private fun String.replaceLast(old: String, new: String) = "$old(?!.*$old)".toRegex().replace(this, new)
}

/**
 * URL: https://www.codewars.com/kata/human-readable-duration-format/kotlin
 */
