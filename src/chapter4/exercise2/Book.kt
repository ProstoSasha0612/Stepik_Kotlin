package chapter4.exercise2

enum class CoverType {
    SOFTCOVER, HARDCOVER, POCKETBOOK, ALBUM
}

data class Book(
    val name: String,
    val year: Int,
    val city: String,
    val size: Int,
    val coverType: CoverType,
    val numberISBN: Long = 1234567890
) {
    private val authors = mutableListOf<String>()
    val authorsList: Collection<String>
        get() {
            return authors
        }

    private val redactors = mutableListOf<String>()
    val redactorsList: Collection<String>
        get() {
            return redactors
        }

    private val translators = mutableListOf<String>()
    val translatorsList: Collection<String>
        get() {
            return translators
        }

    private val publishingHouses = mutableListOf<String>()
    val publishingList:Collection<String>
        get(){
            return publishingHouses
        }

    private val publicationTypes = mutableSetOf<String>()
    val publicationTypeList:Collection<String>
    get() {
        return publicationTypes
    }

    fun addAuthors(vararg authors: String) {
        for (i in authors) {
            this.authors.add(i)
        }
    }

    fun addRedactors(vararg redactors: String) {
        for (i in redactors) {
            this.redactors.add(i)
        }
    }

    fun addTranslators(vararg translators: String) {
        for (i in translators) {
            this.translators.add(i)
        }
    }

    fun addPublishingHouse(vararg publHouses: String) {
        for (i in publHouses) {
            publishingHouses.add(i)
        }

    }

    fun addPublicationType(vararg types: String) {
        for (i in types) {
            publicationTypes.add(i)
        }
    }
}

fun main() {
    val book = Book("Story of Kotlin", 2021,"New-York",1000,CoverType.HARDCOVER)
    book.addPublishingHouse("House1")
}