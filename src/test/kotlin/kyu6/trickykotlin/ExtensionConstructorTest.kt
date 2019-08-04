package kyu6.trickykotlin

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import kotlin.random.Random

class KotlinTricks0 {
    @Test
    fun testInt() {
        val r = Random(System.currentTimeMillis())
        (0..100).forEach { r.nextInt().let { assertEquals(it, kotlin.Int(it.toString())) } }
    }
}