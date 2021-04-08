package chapter2

fun main() {
    val input = readLine() ?: "Nothing"
    val inputList = input.split(" ").sorted()
//    val inputList = listOf("Smith","Jones","Bambury","Patel","Brown","Singh","Williams","Taylor","Wilson","Davies",
//        "Evans","Scott").sorted()
    val res = sortLists(inputList)

    for(i in res){ //красивенький вывод
        for(j in i){
            print(j + " ")
        }
        println()
    }

}

fun sortLists(inputList: List<String>): MutableList<MutableList<String>> {
    val res = mutableListOf<MutableList<String>>()
    var counter = 0
    for (i in inputList) {
        if (res.isEmpty()) { // добавление первого человеека, когда список ещё пуст
            res.add(mutableListOf(i))
            continue
        }
        if (i[0] == res[counter][0][0]) { //если первая буква равна первой букве имени в листе с именами
            res[counter].add(i)
        } else {
            res.add(mutableListOf())
            res[++counter].add(i)
        }
    }
    return res
}
//принять все входные данные в лист
//отсортировать лист в алфавитном порядке
//дальше в цикле проверять нулевой символ каждого элемента списка
// и тут допридумать чутка
//создать лист листов, где в каждый внутренний лист вносить учеников, чьи имена начинаются с одинаковой буквы
//
