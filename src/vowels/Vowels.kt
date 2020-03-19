package vowels

// --- Directions
// Write a function that returns the number of vowels
// used in a string.  Vowels are the characters 'a', 'e'
// 'i', 'o', and 'u'.
// --- Examples
//   vowels("Hi There!") --> 3
//   vowels("Why do you ask?") --> 4
//   vowels("Why?") --> 0

fun vowels(str: String): Int {
    return str.replace(Regex("[^aeiouAEIOU]"), "").length
}


//Solution 1
//fun vowels(str: String): Int {
//    var total = 0
//    for (char in str.toLowerCase()){
//        when (char) {
//            'a', 'e', 'i', 'o', 'u' -> {
//                total ++
//            }
//        }
//    }
//    return total
//}

//Solution 2
//fun vowels(str: String): Int {
//    var total = 0
//    val checker = "aeiou"
//    for (char in str.toLowerCase()){
//        if (checker.contains(char))
//            total++
//    }
//    return total
//}

//Solution 3
//fun vowels(str: String): Int {
//    return str.replace(Regex("[^aeiouAEIOU]"), "").length
//}