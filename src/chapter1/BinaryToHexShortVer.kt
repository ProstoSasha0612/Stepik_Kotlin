package chapter1

import java.math.BigInteger

fun main() {
    val input = readLine()?:"0"
    val binary = BigInteger(input,2)
    println(binary.toString(16))
}