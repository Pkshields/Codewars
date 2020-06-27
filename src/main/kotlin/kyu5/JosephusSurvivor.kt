package kyu5

fun josephusSurvivor(numberOfPeople: Int, killSteps: Int): Int {
    var survivor = killSteps % 2
    for (peopleAlive in 3..numberOfPeople) survivor = (survivor + killSteps) % peopleAlive
    return survivor + 1
}

/**
 * URL: https://www.codewars.com/kata/josephus-survivor/kotlin
 *
 * Algorithm was determined by simply analysing the results:
 *
 *  (killSteps == 3, x people)
 *
 * (2, 3) = 0, 1 >> 1
 * (3, 3) = 0, 1, 2 >> 0, 1 >> 1
 * (4, 3) = 0, 1, 2, 3 >> 0, 1, 3 >> 0, 3 >> 0
 * (5, 3) = 0, 1, 2, 3, 4 >> 0, 1, 3, 4 >> 1, 3, 4 >> 1, 3 >> 3
 * (6, 3) = 0, 1, 2, 3, 4, 5 >> 0, 1, 3, 4, 5 >> 0, 1, 3, 4 >> 0, 1, 4 >> 0, 4 >> 0
 *
 *  (killSteps == 3, x people)
 *
 * (2, 2) = 0, 1 >> 0
 * (3, 2) = 0, 1, 2 >> 0, 2 >> 2
 * (4, 2) = 0, 1, 2, 3 >> 0, 2, 3 >> 0, 2 >> 0
 *
 * Noticed that result == result of (y, numPeople - 1) + killCount, then % by numPeople.
 * Took a good while to figure that out though :)
 */
