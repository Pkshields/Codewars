package kyu6

import java.util.function.LongBinaryOperator
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min

fun som(a:Long, b:Long) = a + b
fun maxi(a:Long, b:Long) = max(a, b)
fun mini(a:Long, b:Long) = min(a, b)

fun gcdi(xx:Long, yy:Long): Long = gcdAlgorithm(abs(xx), abs(yy))
fun gcdAlgorithm(xx:Long, yy:Long): Long = when(yy) {
    0L -> xx
    else -> gcdi(yy, xx % yy)
}

fun lcmu(a:Long, b:Long) = lcmAlgorithm(abs(a), abs(b))
fun lcmAlgorithm(a:Long, b:Long): Long {
    var multiple = a
    while (multiple % b != 0L) {
        multiple += a
    }
    return multiple
}

fun operArray(reducer: LongBinaryOperator, arr:LongArray, init:Long):LongArray {
    var secondValue = init

    return arr.map {
        secondValue = reducer.applyAsLong(it, secondValue)
        secondValue
    }.toLongArray()
}

/**
 * URL: https://www.codewars.com/kata/reducing-by-steps/kotlin
 */