package chapter4.exercise2

class Bookcase {
    private val bookshelfs = mutableListOf<Bookshelf>()
    val getBookshelfs: List<Bookshelf>
        get() = bookshelfs
    val maxSize: Int
    var currentSize = 0
    val color: String

    constructor(bookshelf: Bookshelf, size: Int = 10, color: String = "brown") {
        maxSize = size
        this.color = color
        bookshelfs.add(bookshelf)
        currentSize++
    }

    fun addShelf(bookshelf: Bookshelf){
        if(currentSize<maxSize){
            bookshelfs.add(bookshelf)
        }
        else println("Bookcase already is full")
    }

}