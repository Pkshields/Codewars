package kyu6

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BankersPlanTest {
    @Test
    fun test1() {
        println("Fixed Tests: fortune")
//        testing(fortune(100000, 1.0, 2000, 15, 1.0), true)
        testing(fortune(100000, 1.0, 9185, 12, 1.0), false)

//        testing(fortune(2410562, 3.0, 160995, 13, 6.0), true)
    }

    companion object {
        private fun testing(actual:Boolean, expected:Boolean) {
            assertEquals(expected, actual)
        }
    }
}