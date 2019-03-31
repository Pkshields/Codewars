package kyu7

import kotlin.math.ceil

fun growingPlant(upSpeed: Int, downSpeed: Int, desiredHeight: Int) =
    if (desiredHeight < upSpeed) 1 else ceil((desiredHeight - downSpeed).toDouble() / (upSpeed - downSpeed)).toInt()


/**
 * URL: https://www.codewars.com/kata/simple-fun-number-74-growing-plant/kotlin
 *
 * Working out...
 *
 * Day 1: upSpeed
 * Day 2: 2 * upSpeed - downspeed
 * Day 3: 3 * upSpeed - 2 * downspeed
 * Day 4: 4 * upSpeed - 3 * downspeed
 *
 * Day X = X * upSpeed - (x - 1) * downSpeed
 *
 * dh < xu - (x - 1)d
 * dh < xu - xd + d
 * dh - d < x(u - d)
 */