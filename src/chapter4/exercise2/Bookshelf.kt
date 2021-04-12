package chapter4.exercise2

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

    fun addBooks(vararg books: Book) {
        if (currentSize < maxSize) {
            for (i in books) {
                bookList.add(i)
                currentSize++
            }
        } else println("Book shelf is full")
    }
}