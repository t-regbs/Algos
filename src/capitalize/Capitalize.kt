package capitalize

// --- Directions
// Write a function that accepts a string.  The function should
// capitalize the first letter of each word in the string then
// return the capitalized string.
// --- Examples
//   capitalize("a short sentence") --> "A Short Sentence"
//   capitalize("a lazy fox") --> "A Lazy Fox"
//   capitalize("look, it is working!") --> "Look, It Is Working!"

fun capitalize(str: String): String {
    var res = "${str[0].toUpperCase()}"
    for (i in 1..str.lastIndex){
        res += if (str[i-1] == ' ') str[i].toUpperCase()  else str[i]
    }
    return res
}

fun main() {
    print(capitalize("swimmz"))
}
//Solution 1
//fun capitalize(str: String): String {
//    val words = str.split(" ").toList()
//    var ans = ""
//    for ((index, word) in words.withIndex()){
//        val wrd = "${word[0].toUpperCase()}${word.substring(1)}"
//        ans += if (index == words.size - 1) wrd else "$wrd "
//    }
//    return ans
//}

//Solution 2
//fun capitalize(str: String): String {
//    val words = str.split(" ").toMutableList()
//    for ((index, word) in words.withIndex()){
//        words[index] = word.replace(Regex("\\b[a-zA-Z]"), word[0].toUpperCase().toString())
//    }
//    return words.joinToString(" ")
//}

