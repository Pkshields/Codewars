package kyu6

fun race(a: Int, b: Int, lead: Int): IntArray {
    if (a >= b) return intArrayOf()

    val timeForBToCatchAInSeconds = ((lead * 3600) / (b - a))

    val hours = timeForBToCatchAInSeconds / 3600
    val minutes = (timeForBToCatchAInSeconds / 60) - (hours * 60)
    val seconds = timeForBToCatchAInSeconds - (hours * 3600) - (minutes * 60)

    return intArrayOf(hours, minutes, seconds)
}


/**
 * URL: https://www.codewars.com/kata/tortoise-racing/kotlin
 * 
 * This one really sucked because of floating point errors, they killed any fun solutions I came up with...
 *
 * a = x fph
 * b = y fph
 * y > x
 * lead = a head start
 *
 * How much of a lead does A get?
 * lead = ft
 * a = feet ph
 * lead / a = t[l]
 *
 * Equation
 * a * t[a] = (b * t[b])
 *
 * "how long will it take B to catch A?", so we want to solve for t[b]
 *
 * Equalising times
 * t[a] = t[b] + t[l]
 *
 * a(t[b] + t[l]) = bt[b]
 * at[b] + at[l] = bt[b]
 * at[b] - bt[b] = - at[l]
 * t[b](a - b) = - at[l]
 * t[b] = (- at[l]) / (a - b)
 * t[b] = at[l] / (b - a)
 * t[b] = a(lead / a) / (b - a)
 * t[b] = lead / (b - a)
 *
 */