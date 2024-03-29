package kyu4

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.text.DecimalFormat

class doublesMainTest {
    private fun assertFuzzyEquals(act:Double, exp:Double) {
        val inrange = Math.abs(act - exp) <= 1e-6
        if (inrange == false)
        {
            val df = DecimalFormat("#0.000000")
            println("At 1e-6: Expected must be " + df.format(exp) + ", but got " + df.format(act))
        }
        assertEquals(true, inrange)
    }

    @Test
    fun test1() {
        println("Fixed Tests: doubles")
        assertFuzzyEquals(doubles(1, 10), 0.5580321939764581)
        assertFuzzyEquals(doubles(10, 1000), 0.6921486500921933)

    }
}
