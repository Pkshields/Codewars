package kyu5

import org.junit.jupiter.api.Assertions.assertEquals
import java.math.BigInteger
import org.junit.jupiter.api.Test

class SumFctTest {
    @Test
    fun basicTests() {
        assertEquals(BigInteger.valueOf(80), SumFct.perimeter(5))
        assertEquals(BigInteger.valueOf(216), SumFct.perimeter(7))
        assertEquals(BigInteger.valueOf(14098308), SumFct.perimeter(30))
    }
}
