package no.rikstv.atv.tests

import org.junit.jupiter.api.Test
import junit.framework.Assert.assertEquals

class FirstJUnit5KotlinTest {

    @Test
    fun simpleTestCase() {
        println("A simple test case 1.")

        val numberTwo = 2
        assertEquals(2, numberTwo)
    }
}