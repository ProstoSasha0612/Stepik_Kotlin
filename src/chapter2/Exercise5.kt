package chapter2

fun main() {
    val input = readLine()?:""
    val text = input.substringBefore(' ')
    val find = input.substringAfter(' ')
    //val text = "абракадабрабракадабра"
    //val find = ""абракадабра""
    findSubstrings(text,find).forEach{ println(it)}

}

fun findSubstrings(text: String, substring: String) : MutableList<Int> {
    val res = mutableListOf<Int>()
    val compareSize = substring.length
    var i = 0
    while (i<=text.length- compareSize){
        if(substring == text.substring(i,i+compareSize)){
            res.add(i)
            i+=compareSize
        }
        else i++
    }
    return res
}


/*
for() {
if text == string in i compareSize
res.add(i)
i+= compareSize
}

 */