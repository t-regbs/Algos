package anagrams

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class AnagramsKtTest{
    @Test
    fun `anagrams function exists`(){
        assertNotNull(anagrams("fire", "kjfjkfn"))
    }
    @Test
    fun `"hello" is an anagram of "llohe"`(){
        assertTrue(anagrams("hello", "llohe"))
    }
    @Test
    fun `"Whoa! Hi!" is an anagram of "Hi! Whoa!"`(){
        assertTrue(anagrams("Whoa! Hi!", "Hi! Whoa!"))
    }
    @Test
    fun `"One One" is not an anagram of "Two two two"`(){
        assertFalse(anagrams("One One", "Two two two"))
    }
    @Test
    fun `"One one" is not an anagram of "One one c"`(){
        assertFalse(anagrams("One one", "One one c"))
    }
    @Test
    fun `"A tree, a life, a bench" is not an anagram of "A tree, a fence, a yard"`(){
        assertFalse(anagrams("A tree, a life, a bench", "A tree, a fence, a yard"))
    }
}