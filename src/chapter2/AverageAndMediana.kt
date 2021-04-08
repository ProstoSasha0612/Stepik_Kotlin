package chapter2

fun main() {
    val input = readLine()?:"0"
    val strList = input.split(" ")
    val list = strList.map { it.toDouble() }
    println("${average(list)} ${mediana(list)}" )

}

fun average(list: List<Double>):Double{
    return list.average()
}

fun mediana(list:List<Double>):Double{
    val sortedList = list.sorted()
    if(sortedList.size%2==0){
        return (sortedList.get(sortedList.size/2-1)+sortedList.get(sortedList.size/2))/2
    }
    else return sortedList.get(sortedList.size/2)
}