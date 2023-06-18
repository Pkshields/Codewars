package kyu4

fun rangeExtraction(arr: IntArray): String {
    val startPoints = getStartPointOfRanges(arr)
    val groupedInts = splitListBySplitPoints(arr, startPoints)
    return groupedInts.joinToString(",") {
        if (it.size < 3) it.joinToString(",") else "${it.first()}-${it.last()}"
    }
}

private fun getStartPointOfRanges(intArray: IntArray) =
    listOf(intArray[0]) + intArray.drop(1).filterIndexed { index, i -> i - intArray[index] != 1 }

private fun splitListBySplitPoints(intArray: IntArray, splitPoints: List<Int>) =
    intArray.fold(mutableListOf<MutableList<Int>>()) { groupedInts, nextInt ->
        if (splitPoints.contains(nextInt)) {
            groupedInts.add(mutableListOf(nextInt))
        } else {
            groupedInts.last().add(nextInt)
        }
        groupedInts
    }

/**
 * URL: https://www.codewars.com/kata/51ba717bb08c1cd60f00002f/solutions/kotlin
 *
 * In retrospect, I didn't need to precalculate the list split points
 * In the fold I could have checked for `groupedInts.last().last() - nextInt != 1`
 * Ah well. Left this solution as submitted for posterity...
 */
