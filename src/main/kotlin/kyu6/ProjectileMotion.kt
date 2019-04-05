package kyu6

import kotlin.math.*

class Projectile(startingHeightAsInt: Int, startingVelocityAsInt: Int, angleInDegrees: Int) {
    private val angle = angleInDegrees * PI / 180
    private val launchHeight = startingHeightAsInt.toDouble()
    private val launchVelocity = startingVelocityAsInt.toDouble()
    private val launchHorizontalVelocity = launchVelocity * cos(angle)
    private val launchVerticalVelocity = launchVelocity * sin(angle)

    fun heightEq(): String {
        var result =  "h(t) = -16.0t^2 + ${launchVerticalVelocity.round(3)}t"
        if (launchHeight > 0) {
            result += " + $launchHeight"
        }
        return result
    }

    fun horizEq() = "x(t) = ${launchHorizontalVelocity.round(3)}t"

    fun height(time: Double) =
        (-16 * time.pow(2) + launchVerticalVelocity * time + launchHeight).round(3)

    fun horiz(time: Double) = (launchHorizontalVelocity * time).round(3)

    fun landing(): Array<Double> {
        val timeToLand = solveQuadraticFormula(-16.0, launchVerticalVelocity, launchHeight)
        val landingHorizontalPosition = horiz(timeToLand)
        return arrayOf(landingHorizontalPosition.round(3), 0.0, timeToLand.round(3))
    }

    private fun solveQuadraticFormula(a: Double, b: Double, c: Double): Double {
        val part1 = b * -1
        val part2 = sqrt(b.pow(2) - 4 * a * c)
        val part3 = 2 * a

        val result: Double = (part1 + part2) / part3

        return when {
            result > 0 -> result
            else -> (part1 - part2) / part3
        }
    }
}

fun Double.round(decimalPlaces: Int) = round(this * 10.0.pow(decimalPlaces)) / 10.0.pow(decimalPlaces)

/**
 * URL: https://www.codewars.com/kata/projectile-motion/kotlin
 *
 * Working out...
 *
 * 360D = 2PiR
 * 180D = PiR
 * 1D = (Pi/180)R
 *
 * h = -16t^2 + vt + h0
 * 0 = -16t^2 + vt + h0
 *
 * Magic quadratic equation...
 * -16, v, h0
 *
 * (-v +- sqrt(v^2 - (4*-16*h0)))/(2 * -16)
 * (-v +- sqrt(v^2 - (-64h0))) / -32
 * (-v +- sqrt(v^2 + 64h0)) / -32
 */