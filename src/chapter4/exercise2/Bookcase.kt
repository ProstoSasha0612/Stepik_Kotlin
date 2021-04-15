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

    fun addShelf(bookshelf: Bookshelf) {
        if (currentSize < maxSize) {
            bookshelfs.add(bookshelf)
        } else println("Bookcase already is full")
    }

    class Bookshelf {
        private val bookList = mutableListOf<Book>()
        var currentSize = 0
            private set
        val maxSize: Int
        val coverType: CoverType

        val booksInShelf: List<Book>
            get() {
                return bookList
            }

        constructor(book: Book, size: Int = 10) {
            coverType = book.coverType
            bookList.add(book)
            currentSize++
            maxSize = size
        }

        fun addBooks(book: Book) {
            if (currentSize < maxSize && book.coverType == coverType) {
                bookList.add(book)
                currentSize++
            } else println("Book shelf is full or try to change book's cover type")
        }
    }
}

//fun main() {
//    val book = Book("Story of Kotlin", 2021, "New-York", 1000, CoverType.HARDCOVER)
//    val book2 = Book("Story of Java", 2021, "New-York", 1000, CoverType.HARDCOVER)
//    val book3 = Book("Story of C#", 2021, "New-York", 1000, CoverType.SOFTCOVER)
//    book.addPublishingHouse("House1")
//    val bookcase = Bookcase(Bookcase.Bookshelf(book))
//    bookcase.getBookshelfs.get(0).addBooks(book2)
//    println(bookcase.getBookshelfs[0].coverType)
//    bookcase.getBookshelfs.get(0).addBooks(book3)
//    println(bookcase.getBookshelfs[0].booksInShelf)
//}