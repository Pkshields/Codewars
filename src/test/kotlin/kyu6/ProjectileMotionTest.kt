package kyu6

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ProjectileMotionTest {
    @Test
    fun description() {
        var p = Projectile(5, 2, 45)
        assertEquals("h(t) = -16.0t^2 + 1.414t + 5.0", p.heightEq());
        assertEquals("x(t) = 1.414t", p.horizEq())
        assertEquals(4.643, p.height(0.2))
        assertEquals(0.283, p.horiz(0.2))
        assertEquals(0.856, p.landing()[0])
        assertEquals(0.0, p.landing()[1])
        assertEquals(0.605, p.landing()[2])
    }
    @Test
    fun more() {
        var p = Projectile(0, 5, 45);
        assertEquals("h(t) = -16.0t^2 + 3.536t", p.heightEq())
        assertEquals("x(t) = 3.536t", p.horizEq())
        assertEquals(0.067, p.height(0.2))
        assertEquals(0.707, p.horiz(0.2))
        assertEquals(0.781, p.landing()[0])
        assertEquals(0.0, p.landing()[1])
        assertEquals(0.221, p.landing()[2])
    }
    @Test
    fun more_() {
        var p = Projectile(15, 12, 80)
        assertEquals("h(t) = -16.0t^2 + 11.818t + 15.0", p.heightEq())
        assertEquals("x(t) = 2.084t", p.horizEq())
        assertEquals(15.0, p.height(0.0))
        assertEquals(0.0, p.horiz(0.0))
        assertEquals(10.818, p.height(1.0))
        assertEquals(2.084, p.horiz(1.0))
        assertEquals(2.929, p.landing()[0])
        assertEquals(0.0, p.landing()[1])
        assertEquals(1.406, p.landing()[2])
    }
}