package chapter2

fun main() {
    val input1 = readLine()?.trim()?:"" //?: "".trim()
    val input2 = readLine()?.trim()?:"" //?: "".trim()
    if (isAnagram(input1, input2)) println("Yes")
    else println("No")

}

fun isAnagram(s1: String, s2: String): Boolean {
    val s1Chars = s1.toLowerCase().toList().filter { it !=' ' }
    val s2Chars = s2.toLowerCase().toList().filter { it !=' ' }
    for (ch in s2Chars) {
        if (ch !in s1Chars) return false
    }
    return true
}

//заигнорить пробелы между словами