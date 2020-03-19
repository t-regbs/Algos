package chunk

// --- Directions
// Given an array and chunk size, divide the array into many subarrays
// where each subarray is of length size
// --- Examples
// chunk([1, 2, 3, 4], 2) --> [[ 1, 2], [3, 4]]
// chunk([1, 2, 3, 4, 5], 2) --> [[ 1, 2], [3, 4], [5]]
// chunk([1, 2, 3, 4, 5, 6, 7, 8], 3) --> [[ 1, 2, 3], [4, 5, 6], [7, 8]]
// chunk([1, 2, 3, 4, 5], 4) --> [[ 1, 2, 3, 4], [5]]
// chunk([1, 2, 3, 4, 5], 10) --> [[ 1, 2, 3, 4, 5]]

//Solution 3
fun chunk(array: IntArray, size: Int): List<List<Int>> {
    val chunked = mutableListOf<List<Int>>()
    var index = 0
    var slice : List<Int>
    while (index < array.size){
        slice = if (index+size < array.size){
            array.slice(index until (index+size))
        } else {
            array.slice(index until array.size)
        }
        chunked.add(slice)
        index += size
    }
    return chunked
}

fun main() {
    val arr = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8)
    print(chunk(arr, 3))
}

//Solution 1
//fun chunk(array: IntArray, size: Int): List<List<Int>>{
//    return array.toList().chunked(size)
//}

//Solution 2
//fun chunk(array: IntArray, size: Int): List<List<Int>>{
//    return array.toList().windowed(size,size, true)
//}

