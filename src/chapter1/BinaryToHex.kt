package chapter1

import kotlin.text.StringBuilder


fun tetradaToHex(str:String):String{
    val a = str.toInt()
    var res = 0
    for(i in 0..3){
        if(str[i] == '1'){
            res+= Math.pow(2.0,i.toDouble()).toInt()
        }
    }
    val resStr:String = when(res){
        in 0..9 -> return res.toString()
        10 ->  "A"
        11 -> return "B"
        12 -> return "C"
        13 -> return "D"
        14 -> return "E"
        15 -> return "F"
        else -> "0"
    }
    return resStr
}


fun main() {
    var input = readLine()?: "0000" // тут можно сделать покрасивее создавая sb, который в качестве аргумента принимает redaline
    val sb1 = StringBuilder(input) // сделал длину вводимой строки кратной 4ем, дополняя её нулями
    while (sb1.length%4 !=0){
        sb1.append("0")
    }
    input = sb1.toString()

    val tetradaList = ArrayList<String>() // коллекция содержащая строки по 4 символа в каждом элементе

    var i =0
    val sb = StringBuilder("")
    while (i < input.length){           // на выходе этого цикла tetradaList заполнен
        repeat(4){
            sb.append(input[i++])
        }
        if (sb.toString()!="0000")tetradaList.add(sb.toString())
        sb.clear()
    }

    val result = StringBuilder()
    for(i in tetradaList){
        result.append(tetradaToHex(i.reversed())) // передается reversed, так как мы расшифровываем бинарную систему справа налево
    }

    println(result)
}

//в конце добваить удаление нулей в начале числа