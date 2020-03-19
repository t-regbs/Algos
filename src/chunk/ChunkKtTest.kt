package chunk

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ChunkKtTest{
    @Test
    fun `Function chunk exists`(){
        assertNotNull(chunk(intArrayOf(2,3),1))
    }
    @Test
    fun `chunk divides an array of 10 elements with chunk size 2`(){
        val arr = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val chunked = chunk(arr, 2)
        assertEquals(chunked, mutableListOf(listOf(1,2), listOf(3,4), listOf(5,6), listOf(7,8), listOf(9,10)))
    }
    @Test
    fun `chunk divides an array of 3 elements with chunk size 1`(){
        val arr = intArrayOf(1,2,3)
        val chunked = chunk(arr, 1)
        assertEquals(chunked, mutableListOf(listOf(1), listOf(2), listOf(3)))
    }
    @Test
    fun `chunk divides an array of 5 elements with chunk size 3`(){
        val arr = intArrayOf(1,2,3,4,5)
        val chunked = chunk(arr, 3)
        assertEquals(chunked, mutableListOf(listOf(1,2,3), listOf(4,5)))
    }
    @Test
    fun `chunk divides an array of 13 elements with chunk size 5`(){
        val arr = intArrayOf(1,2,3,4,5,6,7,8,9,10,11,12,13)
        val chunked = chunk(arr, 5)
        assertEquals(chunked, mutableListOf(listOf(1,2,3,4,5), listOf(6,7,8,9,10), listOf(11,12,13)))
    }
}