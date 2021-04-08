package chapter1

fun bubbleSort(inputList: List<String>) : IntArray {
    val tmpList: MutableList<Int> = ArrayList()
    for(value in inputList){
        tmpList.add(value.toInt())
    }

    for(i in  0 until tmpList.size-1){
        for(j in i+1 until tmpList.size){
            if(tmpList[i] > tmpList[j]){
                val tmp = tmpList[i]
                tmpList[i] =  tmpList[j]
                tmpList[j] = tmp
            }
        }
    }
    return tmpList.toIntArray()
}

fun main() {
    val list = listOf<String>("1","2","5","3","0","-1")

    println(list)
}


