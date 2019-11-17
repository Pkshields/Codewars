package kyu6

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.math.BigInteger

class HiddenSeqTest {
    private fun testing(actual: BigInteger, expected:BigInteger) {
        assertEquals(expected, actual)
    }
    @Test
    fun test1() {
        println("Fixed Tests: fcn")
        testing(fcn(21), BigInteger.valueOf(2097152))
        testing(fcn(43), BigInteger.valueOf(8796093022208L))
    }
}