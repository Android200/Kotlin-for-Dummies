package Kotlin_Tutorial_Point

fun main(){
    // Data Class
    /**
     *This type of class can be used to hold the basic data apart. Other than this, it does not provide any other
      functionality. All the data classes need to have one primary constructor and all the primary constructor
      should have at least one parameter. Whenever a class is marked as data, we can use some
      of the inbuilt function of that data class such as “toString()”,”hasCode()”, etc. Any data
      class cannot have a modifier like abstract and open or internal. Data class can be extended
      to other classes too.
     */
    val book: Book = Book("Kotlin", "TutorialPoint.com", 5)
    println("Name of the Book is-- ${book.name}")
    println("Publisher Name-- ${book.publisher}")
    println("Review of the book is-- ${book.reviewScore}")
    book.reviewScore = 7
    println("Printing all the info all together-- $book")
    println("Example of the HasCode function-- ${book.hashCode()}")





}

data class Book(val name: String, val publisher: String, var reviewScore: Int)