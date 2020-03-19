package reversestring
// --- Directions
// Given a string, return a new string with the reversed
// order of characters
// --- Examples
//   reverseString("apple") == "elppa"
//   reverseString("hello") == "olleh"
//   reverseString("Greetings!") == "!sgniteerG"

fun reverseString(str: String): String {
    var reversed = ""
    for (character in str) {
        reversed = character + reversed
    }
    return reversed
}


//Solution 1
//fun reverseString(str: String): String {
//    return str.reversed()
//}


//Solution 2
//fun reverseString(str: String): String {
//
//    var reversed = ""
//    for (character in str) {
//        reversed = character + reversed
//    }
//    return reversed
//}