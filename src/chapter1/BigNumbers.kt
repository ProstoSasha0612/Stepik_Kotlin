package chapter1

import java.lang.StringBuilder
import java.math.BigInteger

fun main() {
    var res:BigInteger = BigInteger("0")
    for(i in 1..3){
        res = res.add(readLine()?.toBigInteger()?:throw Exception())
    }

    val finalResult = StringBuilder("")
    for(i in 0 until 9){
        finalResult.append(res.toString()[i])
    }
    println(finalResult) //result value
}