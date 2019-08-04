package kyu6

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class TortoiseRacingTest {
    @Test
    fun test1() {
        println("Basic Tests")
        assertArrayEquals(intArrayOf(0, 32, 18), race(720, 850, 70))
        assertArrayEquals(intArrayOf(3, 21, 49), race(80, 91, 37))

        assertArrayEquals(intArrayOf(18, 20, 0), race(820, 850, 550))
    }
}