package kyu4

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TimeFormatterTest {
    @Test
    fun testFormatDurationExamples() {
        // Example Test Cases
        assertEquals("1 second", TimeFormatter.formatDuration(1))
        assertEquals("1 minute and 2 seconds", TimeFormatter.formatDuration(62))
        assertEquals("2 minutes", TimeFormatter.formatDuration(120))
        assertEquals("1 hour", TimeFormatter.formatDuration(3600))
        assertEquals("1 hour, 1 minute and 2 seconds", TimeFormatter.formatDuration(3662))
    }

    @Test
    fun testWithDays() {
        assertEquals("98 days, 21 hours, 21 minutes and 6 seconds", TimeFormatter.formatDuration(8544066))
    }

    @Test
    fun testNow() {
        assertEquals("now", TimeFormatter.formatDuration(0))
    }

    @Test
    fun testWithYears() {
        assertEquals("4 years, 68 days, 3 hours and 4 minutes", TimeFormatter.formatDuration(132030240))
    }
}
