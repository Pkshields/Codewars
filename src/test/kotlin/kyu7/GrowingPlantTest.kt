package kyu7

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class GrowingPlantTest {
    @Test
    fun testFixed() {
        assertEquals(10, growingPlant(100,10,910))
        assertEquals(1, growingPlant(10,9,4))
        assertEquals(5, growingPlant(15,0,65))
    }
}