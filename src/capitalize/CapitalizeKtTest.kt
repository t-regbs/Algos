package capitalize

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CapitalizeKtTest{
    @Test
    fun `capitalize function exists`(){
        assertNotNull(capitalize("swimas"))
    }
    @Test
    fun `capitalizes the first letter of every word in a sentence`(){
        assertEquals(capitalize("hi there, how is it going?"),
            "Hi There, How Is It Going?")
    }
    @Test
    fun `capitalizes the first letter`(){
        assertEquals(capitalize("i love breakfast at bill miller bbq"),
            "I Love Breakfast At Bill Miller Bbq")
    }
}