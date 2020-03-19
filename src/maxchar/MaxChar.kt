package maxchar

// --- Directions
// Given a string, return the character that is most
// commonly used in the string.
// --- Examples
// maxChar("abcccccccd") == 'c'
// maxChar("apple 1231111") == '1'

fun maxChar(str: String): Char{
    val map: HashMap<Char, Int> = HashMap()
    var max = 0
    var maxChar = '0'
    for (char in str){
        map[char] = if (!map.containsKey(char)) 1 else map[char]!! + 1
    }
    for (key in map.keys){
        if (max < map[key]!!) {
            max = map[key]!!
            maxChar = key
        }
    }
    return maxChar
}

fun main() {
    print(maxChar("abcccccccd"))
}