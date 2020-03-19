package maxchar

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MaxCharKtTest{
    @Test
    fun `maxChar function exists`(){
        assertNotNull(maxChar("fire"))
    }
    @Test
    fun `Finds the most frequently used char`(){
        assertEquals(maxChar("a"), 'a')
        assertEquals(maxChar("abcdefghijklmnaaaaa"), 'a')
    }
    @Test
    fun `Works with numbers in the string`(){
        assertEquals(maxChar("ab1c1d1e1f1g1"), '1')
    }
}