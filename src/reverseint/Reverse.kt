package reverseint

import kotlin.math.sign

// --- Directions
// Given an integer, return an integer that is the reverse
// ordering of numbers.
// --- Examples
//   reverseInt(15) == 51
//   reverseInt(981) == 189
//   reverseInt(500) == 5
//   reverseInt(-15) == -51
//   reverseInt(-90) == -9

fun reverseInt(n: Int): Int {
    var rev = ""
    var pos: Int
    return if (n<0){
        pos = n * -1
        for (i in pos.toString()) {
            rev = "$i$rev"
        }
        (rev.toInt() * -1)
    } else {
        pos = n
        for (i in pos.toString()) {
            rev = "$i$rev"
        }
        rev.toInt()
    }
}

fun main() {
    println(reverseInt(0))
}

//Solution 1
//fun reverseInt(n: Int): Int {
//    if (n < 0) {
//        val temp  = n * -1
//        return temp.toString().reversed().toInt() * -1
//    }
//    return n.toString().reversed().toInt()
//}

//Solution 2
//fun reverseInt(n: Int): Int {
//    var rev = ""
//    var pos = 0
//    pos = (if (n < 0) n * -1 else n)
//    for (i in pos.toString()) {
//        rev = "$i$rev"
//    }
//    return (rev.toInt() * sign(n.toDouble())).toInt()
//
//}