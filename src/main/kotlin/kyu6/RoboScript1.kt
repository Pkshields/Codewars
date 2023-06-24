package kyu6

fun highlight(code: String) =
    splitCodeIntoComponentParts(code)
        .joinToString("", transform = ::applySyntaxHighlighting)

private fun splitCodeIntoComponentParts(code: String) =
    "F+|L+|R+|[0-9]+|[()]+".toRegex().findAll(code).flatMap { it.groupValues }.toList()

private fun applySyntaxHighlighting(code: String) =
    getSyntaxColor(code)?.let { "<span style=\"color: $it\">$code</span>" } ?: code

private fun getSyntaxColor(code: String) = code.first().let {
    if (it == 'F') "pink"
    else if (it == 'L') "red"
    else if (it == 'R') "green"
    else if (it.digitToIntOrNull() != null) "orange"
    else null
}

/**
 * URL: https://www.codewars.com/kata/58708934a44cfccca60000c4/kotlin
 */
