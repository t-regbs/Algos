package reverseint

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ReverseIntTest{
    @Test
    fun `ReverseInt function exists`(){
        assertNotNull(reverseInt(22))
    }
    @Test
    fun `ReverseInt handles 0 as an input`(){
        assertEquals(reverseInt(0), 0)
    }
    @Test
    fun `ReverseInt Flips a positive number`(){
        assertEquals(reverseInt(5), 5)
        assertEquals(reverseInt(15), 51)
        assertEquals(reverseInt(90), 9)
        assertEquals(reverseInt(2359), 9532)
    }
    @Test
    fun `ReverseInt flips a negative number`(){
        assertEquals(reverseInt(-5), -5)
        assertEquals(reverseInt(-15), -51)
        assertEquals(reverseInt(-90), -9)
        assertEquals(reverseInt(-2359), -9532)
    }
}