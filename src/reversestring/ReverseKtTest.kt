package reversestring

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ReverseKtTest{
    @Test
    fun `Reverse reverses a String`(){
        assertEquals(reverseString("abcd"), "dcba")
    }
    @Test
    fun `Reverse reverses another String`(){
        assertEquals(reverseString("  abcd"), "dcba  ")
    }
    @Test
    fun `Reverse function exists`(){
        assertNotNull(reverseString("abcd"))
    }
}