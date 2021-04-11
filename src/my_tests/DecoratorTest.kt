package my_tests

fun main() {

}

class CountingSet<T>(val innerSet:MutableSet<T>):MutableSet<T> by innerSet{
    var elementsAdded = 0 //количество попыток добавления элемента в SET
    override fun add(element: T): Boolean {
        elementsAdded++
        return innerSet.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        elementsAdded+= elements.size
        return innerSet.addAll(elements
        )
    }
}