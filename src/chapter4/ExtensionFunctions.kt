package chapter4

fun Int.r(): RationalNumber = RationalNumber(this.toInt(),1)
fun Pair<Int, Int>.r(): RationalNumber = RationalNumber(first,second)

data class RationalNumber(val numerator: Int, val denominator: Int)
