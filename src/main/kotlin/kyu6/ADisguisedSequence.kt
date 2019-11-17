package kyu6

import java.math.BigInteger

fun fcn(n:Int) = BigInteger.valueOf(2).pow(n)

/**
 * URL: https://www.codewars.com/kata/a-disguised-sequence-i/kotlin
 *
 *  6(u^n)(u^n+1)-5(u^n)(u^n+2)+(u^n+1)(u^n+2) = 0
 * u0 = 1, u1 = 2
 *
 * 6(1)(2)-5(1)(x)+(2)(x)=0
 * 12-5x+2x=0
 * 12-3x=0
 * 3x=12
 * x=4
 *
 * u1 = 2, u2 = 4
 *
 * 6(2)(4)-5(2)(x)+(4)(x)=0
 * 48-10x+4x=0
 * 48-6x=0
 * 6x=48
 * x=8
 *
 * 0 1 2 3 4
 * 1 2 4 8 16x
 * 2^n
 *
 *
 * THE OTHER WAY TO DO IT ALGORITHMICALLY, RATHER THAN FIGURING IT OUT MATHEMATICALLY
 *
 * https://www.codewars.com/kata/reviews/5a4b34475f08297934002adc/groups/5a9679fe8b8fb70829001308
 */