package chapter4

import java.util.*
import kotlin.Comparator

//first way
fun getList(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, object : Comparator<Int> {
        override fun compare(o1: Int, o2: Int): Int {
            return o2.compareTo(o1)
        }
    })
    return arrayList
}
