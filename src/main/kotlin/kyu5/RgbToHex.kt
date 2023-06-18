package kyu5

import kotlin.math.max
import kotlin.math.min
import kotlin.math.pow

fun rgb(r: Int, g: Int, b: Int) =
    ((sanitize(r) * 16.pow(4)) + (sanitize(g) * 16.pow(2)) + sanitize(b)).toHexString()

private fun sanitize(input: Int) = max(min(input, 255), 0).toLong()
private fun Long.toHexString() = this.toString(16).padStart(6, '0').uppercase()
private fun Int.pow(power: Int) = this.toDouble().pow(power).toInt()

/**
 * URL: https://www.codewars.com/kata/rgb-to-hex-conversion/kotlin
 *
 * #FFFFFF == 16777215 decimal
 * #FFFFFF == (15 × 16^5) + (15 × 16^4) + (15 × 16^3) + (15 × 16^2) + (15 × 16^1) + 15
 * #FFFFFF == 15^4((15 × 16) + 15) + 15^2((15 × 16) + 15) + ((15 × 16) + 15)
 * (15 × 16) + 15 == r or g or b
 * #FFFFFF == 15^4(r) + 15^2(g) + b
 *
 * Thanks for the help https://www.rapidtables.com/convert/number/hex-to-decimal.html?x=FFFFFF
 */
