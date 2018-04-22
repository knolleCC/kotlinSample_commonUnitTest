package de.creatorcat.samples

import kotlin.test.Test
import kotlin.test.assertEquals

class SampleJvmTest {
    @Test fun verify_bar() {
        assertEquals("bar", bar())
    }
}
