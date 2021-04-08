package chapter1

fun shortSort(inputList: List<String>) : IntArray = inputList.map { it.toInt() }.sorted().toIntArray()
