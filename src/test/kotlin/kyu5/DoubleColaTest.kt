package kyu5

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DoubleColaTest {
    @Test
    fun testWhoIsNext() {
        var names = listOf("Sheldon", "Leonard", "Penny", "Rajesh", "Howard")
        assertEquals(whoIsNext(names, 1), "Sheldon")
        assertEquals(whoIsNext(names, 6), "Sheldon")
        assertEquals(whoIsNext(names, 1802), "Penny")
        assertEquals(whoIsNext(names, 10), "Penny")

        names = listOf("Daisuke Aramaki", "Motoko Kusanagi", "Batou", "Togusa", "Ishikawa", "Saito", "Pazu", "Borma", "Azuma", "Yano", "Proto")
        assertEquals(whoIsNext(names, 517984), "Ishikawa")
    }
}