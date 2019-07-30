package kyu5

import kotlin.math.*

fun whoIsNext(names: List<String>, n: Int): String {
    if (n <= names.count()) return names[n-1]

    val completedQueues = names.numberOfCompletedQueues(n)
    val nthPosInCurrentQueue = n - names.drinksDrankAfterQueuesCompleted(completedQueues)
    val nthPosInOriginalQueue = nthPosInCurrentQueue / 2.pow(completedQueues)

    return names[nthPosInOriginalQueue]
}

private fun <T> List<T>.numberOfCompletedQueues(n: Int) = floor(log((n/count()) + 1, 2)).toInt()
private fun <T> List<T>.drinksDrankAfterQueuesCompleted(numQueues: Int) = count() * (2.pow(numQueues) - 1)

private fun log(x: Int, base: Int) = log(x.toDouble(), base.toDouble())
private fun Int.pow(power: Int) = this.toDouble().pow(power).toInt()

/*
 * 5 names in list
 * 5, 10, 20, 40
 *
 * n = 14
 * [a, b, c, d, e]
 * n > length, so...
 * n -= length
 *
 * n = 9
 * [a, a, b, b, c, c, d, d, e, e]
 *
 * n is in list, it's "e". Get position in initial list?
 * min(n / duplicationCount)?
 *
 *
 * n = 44
 * [a, b, c, d, e]
 *
 * n = 39
 * [a, a, b, b, c, c, d, d, e, e]
 *
 * n = 29
 * [a, a, a, a, b, b, b, b, c, c, c, c, d, d, d, d, e, e, e, e]
 *
 * n = 14
 * [a, a, a, a, a, a, a, a, b, b, b, b, b, b, b, b, c, c, c, c, c, c, c, c, d, d, d, d, d, d, d, d, e, e, e, e, e, e, e, e] (length 40)
 *
 * n == b
 *
 * correlating n back to the original, we need to divide n by the number of times
 * we had to loop through the drinkers
 *
 * n(0) = n / 2^loops
 *
 * *********
 *
 * 0 loops, 0 drunks drank
 * 1 loop, 5 drinks drank
 * 2 loops, 10 drinks drank
 * 3 loops, 20 drinks drank
 * 4 loops, 40 drinks drank
 *
 * Ignore 0 as special case for now
 *
 * 4 loops completed, 75 drinks drank
 *
 * 75 = 5 + 10 + 20 + 40
 * 75 = 5(1 + 2 + 4 + 8)
 * 75 = 5(2^0 + 2^1 + 2^2 + 2^3)
 * 75 = 5(2^4 - 1) [https://en.wikipedia.org/wiki/1_%2B_2_%2B_4_%2B_8_%2B_%E2%8B%AF]
 *
 * n = 5(2^l - 1)
 * (n/5) = 2^l - 1
 * 2^l = (n/5) + 1
 * l = log[2]((n/5) + 1)
 */
