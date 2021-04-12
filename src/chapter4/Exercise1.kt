package chapter4

interface Quackable {
    fun quack():String
}

interface Swimable{
    fun swim()
}

interface Gnawable{
    fun gnaw(): String
}

class Duck : Quackable, Swimable {
    override fun swim() {
        println("Плаваю")
    }

    override fun quack() = "Кря-кря"
}

class Goose : Gnawable, Swimable {
    override fun gnaw() = "Щип-щип"
    override fun swim() {
        println("Плаваю")
    }
}