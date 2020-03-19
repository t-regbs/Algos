package steps

// --- Directions
// Write a function that accepts a positive number N.
// The function should console log a step shape
// with N levels using the # character.  Make sure the
// step has spaces on the right hand side!
// --- Examples
//   steps(2)
//       '# '
//       '##'
//   steps(3)
//       '#  '
//       '## '
//       '###'
//   steps(4)
//       '#   '
//       '##  '
//       '### '
//       '####'

fun steps(n: Int, row: Int = 0, stair: String = " ") {
    if (n == row) {
        return
    }
    if (n == stair.length){
        println(stair)
        return steps(n, row + 1)
    }

//    stair += if (stair.length <= row) "#" else " "

}
fun main() {
    steps(5)
}

//Solution 1
//fun steps(n: Int) {
//    var i = n
//    var hash = "#"
//    while (i > 0){
//        println("$hash${"".repeat(i-1)}")
//        hash += "#"
//        i--
//    }
//}

//Solution 2
//fun steps(n: Int) {
//    for (row in 0 until n){
//        var stair = ""
//        for (col in 0 until n){
//            stair += if (col <= row) "#" else ""
//        }
//        println(stair)
//    }
//}