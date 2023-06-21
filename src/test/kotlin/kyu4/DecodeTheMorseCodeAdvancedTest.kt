package kyu4

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DecodeTheMorseCodeTests {
    @Test
    fun exampleTestCases() {
        assertEquals("HEY JUDE", decodeMorse(decodeBits("1100110011001100000011000000111111001100111111001111110000000000000011001111110011111100111111000000110011001111110000001111110011001100000011")))
    }

    @Test
    fun testBasicBitsDecoding() {
        assertEquals("M", decodeMorse(decodeBits("1110111")))
    }

    @Test
    fun testMultipleBitsPerDotHandling() {
        assertEquals("M", decodeMorse(decodeBits("11111100111111")))
    }
}
