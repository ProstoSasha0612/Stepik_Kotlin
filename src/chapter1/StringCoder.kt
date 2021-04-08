package chapter1

fun main() {
    val input = readLine()
    val tstr = input?:throw IllegalArgumentException()
   // val tstr = "aaabbbbaabccc" // -> a3b4a2b1c3

    val res:StringBuilder = StringBuilder("")
    var repeatCounter = 1

    for(i in 0 until tstr.length-1){ // делает проверку, но условие if не подходит чтобы добавить последний элемент
        if(tstr[i] !=tstr[i+1] || i == tstr.length){
            res.append(tstr[i])
            res.append(repeatCounter)
            repeatCounter = 1
        }
        else repeatCounter++
    }
    res.append(tstr[tstr.length-1])
    res.append(repeatCounter)
    println(res)


}

//repeatcounter =1 по умолчанию
//если str[i] != str[i+1] -> res.append(str[i])     res.append(repeatcounter.toString)      repeatcounter =1
//else repeatcounter++
//



//var resCounter = 0
//    var repeatCounter = 0
//
//    for(i in 0 until tstr.length){
//        if(res[resCounter] !=tstr[i]){
//            res.append(tstr[i])    //стало равно a
//            repeatCounter = 1
//        }
//        else repeatCounter++
//
//        if(tstr[i] != tstr[i+1]) { // переходим к след элементу
//            resCounter++
//            res.append(repeatCounter.toChar())
//            repeatCounter = 0
//        }
//    }