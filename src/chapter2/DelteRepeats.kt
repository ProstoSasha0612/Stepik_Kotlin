package chapter2

fun deleteCopies(inputList:List<String>):List<String>{
    val resList = mutableListOf<String>()
    for(i in inputList){
        if(i !in resList){
            resList.add(i)
        }
    }
    return resList
}


fun main() {
    val list = listOf("Anna","Ben","Alex","Peter","Jack","Ben")
    println(deleteCopies(list))
}