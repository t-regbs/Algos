package palindrome

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class PalindromeKtTest{
    @Test
    fun `palindrome fun exists`(){
        assertNotNull(palindrome(""))
    }
    @Test
    fun `"aba" is a palindrome`(){
        assertTrue(palindrome("aba") )
    }
    @Test
    fun `" aba" is not a palindrome`(){
        assertFalse(palindrome(" aba") )
    }
    @Test
    fun `"aba " is not a palindrome`(){
        assertFalse(palindrome("aba ") )
    }
    @Test
    fun `"greetings" is not a palindrome`(){
        assertFalse(palindrome("greetings"))
    }
    @Test
    fun `"1000000001" is a palindrome`(){
        assertTrue(palindrome("1000000001"))
    }
    @Test
    fun `"Fish hsif" is not a palindrome`(){
        assertFalse(palindrome("Fish hsif"))
    }
    @Test
    fun `"pennep" is a palindrome`(){
        assertTrue(palindrome("pennep"))
    }
}

//test('"pennep" a palindrome', () => {
//    expect(palindrome('pennep')).toBeTruthy();
//});*/
