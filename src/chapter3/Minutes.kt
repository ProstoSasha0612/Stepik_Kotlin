package chapter3


fun main() {
    val input = readLine()?.toInt() ?: 0
    var hours = input / 60 //нашли начальное количество часов
    if (input % 60 >= 30) hours++ // нашли количество дней по часам( если осталось 30 мин, то прибавляем ещё одиин час)
    var days = hours/24      //нашли дни
    hours%=24       // после преобразования дней в часы, нужно оставить только те часы, которые остались после преобразования в дни

    println("days: $days")
    println("hours: $hours")
}
