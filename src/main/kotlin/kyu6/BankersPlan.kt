package kyu6

/**
 * f0 = initialDeposit
 * p = interestRate
 * c0 = withdrawal year 0
 * n = nthYear
 * i = inflation: Double
 */

fun fortune(f0: Int, p: Double, c0: Int, n: Int, i: Double) =
    calculateBalance(f0.toDouble(), p * 0.01, c0.toDouble(), n, i * 0.01) > 0

tailrec fun calculateBalance(currentBalance: Double, interestRate: Double, withdrawal: Double, yearsLeft: Int, inflation: Double): Double =
    when(yearsLeft) {
        1 -> currentBalance
        else -> {
            val balance = currentBalance * (1 + interestRate) - withdrawal
            val nextYearsWithdrawal = withdrawal * (1 + inflation)
            calculateBalance(balance, interestRate, nextYearsWithdrawal, yearsLeft - 1, inflation)
        }
    }

/**
 * URL: https://www.codewars.com/kata/bankers-plan/kotlin
 *
 * Working out...
 *
 * f0 = 100000, p = 1 percent, c0 = 2000, n = 15, i = 1 percent
 *
 * End of year 1 = f0
 * End of year 2:
 * f1 = f0 + (p * 0.01) * f0 - c0
 * f1 = f0 + interest - withdrawl
 * c1 = c0 + c0*(p * 0.01)
 * c1 = c0 + inflationRequirements
 *
 * cn = c(n-1) * (1 + (p * 0.01))
 * fn = f(n-1)(1 + (p * 0.01)) - c(n-1)
 */