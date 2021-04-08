package chapter2

fun main() {
    val input1 = readLine()?.trim()?:"" //?: "".trim()
    val input2 = readLine()?.trim()?:"" //?: "".trim()
    if (isAnagram(input1, input2)) println("Yes")
    else println("No")

}

fun isAnagram(s1: String, s2: String): Boolean {
    val s1Chars = s1.toLowerCase().toList()
    val s2Chars = s2.toLowerCase().toList()
    for (ch in s1Chars) {
        if (ch !in s2Chars) return false
    }
    return true
}