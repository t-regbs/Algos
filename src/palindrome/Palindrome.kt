package palindrome

// --- Directions
// Given a string, return true if the string is a palindrome
// or false if it is not.  Palindromes are strings that
// form the same word if it is reversed. *Do* include spaces
// and punctuation in determining if the string is a palindrome.
// --- Examples:
//   palindrome("abba") == true
//   palindrome("abcdefg") == false

fun palindrome(str: String): Boolean {
    return false
}


//Solution 1
//fun palindrome(str: String): Boolean {
//    var rev = ""
//    for (char in str) rev = "$char$rev"
//    return rev == str
//}

//Solution 2
//fun palindrome(str: String): Boolean {
//    return str.reversed() == str
//}