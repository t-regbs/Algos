package vowels

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class VowelsKtTest{
    @Test
    fun `vowels is a function`(){
        assertNotNull(vowels("string"))
    }
    @Test
    fun `returns the number of vowels used`(){
        assertEquals(vowels("aeiou"), 5)
    }
    @Test
    fun `returns the number of vowels used when they are capitalized`(){
        assertEquals(vowels("AEIOU"), 5)
    }

    @Test
    fun `returns the number of vowels used 1`() {
        assertEquals(vowels("abcdefghijklmnopqrstuvwxyz"), 5)
    }
    @Test
    fun `returns the number of vowels used 2`(){
        assertEquals(vowels("bcdfghjkl"), 0)
    }

}