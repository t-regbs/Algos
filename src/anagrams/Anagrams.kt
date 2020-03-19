package anagrams

import java.util.*

// --- Directions
// Check to see if two provided strings are anagrams of each other.
// One string is an anagram of another if it uses the same characters
// in the same quantity. Only consider characters, not spaces
// or punctuation.  Consider capital letters to be the same as lower case
// --- Examples
//   anagrams("rail safety", "fairy tales") --> True
//   anagrams("RAIL! SAFETY!", "fairy tales") --> True
//   anagrams("Hi there", "Bye there") --> False

fun anagrams(stringA: String, stringB: String): Boolean{
    val first = stringA.replace(Regex("[^\\w]+"), "").toLowerCase()
    val sec = stringB.replace(Regex("[^\\w]+"), "").toLowerCase()

    return Arrays.equals(first.chars().sorted().toArray(), sec.chars().sorted().toArray())
}



fun main() {
    print(anagrams("One one", "One one ci"))
}


//Solution 1
//fun anagrams(stringA: String, stringB: String): Boolean{
//    return buildHashMap(stringA) == buildHashMap(stringB)
//}
//
//fun buildHashMap(str: String): HashMap<Char, Int>{
//    val map = HashMap<Char, Int>()
//    for (char in str.replace(Regex("[^\\w]+"), "").toLowerCase()){
//        map[char] = if (map.containsKey(char)) map[char]!!+1 else 1
//    }
//    return map
//}

//Solution 2
//fun anagrams(stringA: String, stringB: String): Boolean{
//    val first = stringA.replace(Regex("[^\\w]+"), "").toLowerCase()
//    val sec = stringB.replace(Regex("[^\\w]+"), "").toLowerCase()
//
//    return Arrays.equals(first.chars().sorted().toArray(), sec.chars().sorted().toArray())
//}