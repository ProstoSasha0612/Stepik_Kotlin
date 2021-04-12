package chapter4

class HydraGoose (var innerMatrix: Array<IntArray>) {
    val declareOneself: String
        get() = """
        |░░░░░░░░░░░░░░░░░░░░
        |░░░░▄▀▀▀▄░░░░░░░░░░░
        |▄███▀░◐░▄▀▀▀▄░░░░░░
        |░░▄███▀░◐░░░░▌░░░░░
        |░░░▐░▄▀▀▀▄░░░▌░░░░░░
        |▄███▀░◐░░░▌░░▌░░░░
        |░░░░▌░░░░░▐▄▄▌░░░░░
        |░░░░▌░░░░▄▀▒▒▀▀▀▀▄
        |░░░▐░░░░▐▒▒▒▒▒▒▒▒▀▀▄
        |░░░▐░░░░▐▄▒▒▒▒▒▒▒▒▒▒▀▄
        |░░░░▀▄░░░░▀▄▒▒▒▒▒▒▒▒▒▒▀▄
        |░░░░░░▀▄▄▄▄▄█▄▄▄▄▄▄▄▄▄▄▄▀▄
        |░░░░░░░░░░░▌▌░▌▌░░░░░
        |░░░░░░░░░░░▌▌░▌▌░░░░░
        |░░░░░░░░░▄▄▌▌▄▌▌░░░░░"""
}

fun HydraGoose.squeak():String{
    return "Пищу"
}

fun HydraGoose.whistle():String{
    return "Свистчу"
}

fun HydraGoose.quack():String{
    return "Квакаю"
}

fun HydraGoose.transpose(){
    var resMatrix:Array<IntArray> = arrayOf<IntArray>() //массив массивов интов
    var i = 0
    var j = 0
    while (i<innerMatrix[0].size){  // 2
        resMatrix+=IntArray(innerMatrix.size) // добавляем новый IntArray в наш массив
        while (j<innerMatrix.size){ // 3
            resMatrix[i][j] = innerMatrix[j][i]
            j++
        }
        i++
        j = 0
    }
    innerMatrix = resMatrix
}

fun main() {
    val matrix = arrayOf<IntArray>(IntArray(2),IntArray(2), IntArray(2))
    matrix[0][0] = 1
    matrix[1][0] = 2
    matrix[2][0] = 3
    matrix[0][1] = 4
    matrix[1][1] = 5
    matrix[2][1] = 6
    matrix.forEach { it.forEach { println(it) } }



    val hydraGoose = HydraGoose(matrix)
    hydraGoose.transpose()

}