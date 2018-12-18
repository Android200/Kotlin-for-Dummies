import java.io.BufferedReader
import java.util.*

fun main(){

    //1
    /*You declare a simple data class with two properties: name and age. The age property
    is null by default (if it isn’t specified). When creating the list of people, you omit
    Alice’s age, so the default value null is used. Then you use the maxBy function to find
    the oldest person in the list. The lambda expression passed to the function takes one
    parameter, and you use it as the default name of that parameter. The Elvis operator
    (?:) returns zero if age is null. Because Alice’s age isn’t specified, the Elvis operator
    replaces it with zero, so Bob wins the prize for being the oldest person.*/
    val mutane = listOf(Mutane("Alice"), Mutane("Bob", age = 29), Mutane("Musa", age = 89))
    val oldest = mutane.maxBy { it.age ?: 0 }
    println("The Oldest is: $oldest")

    //2
    println("Max Value is: ${max(1,2)}")

    //3
    val married = Married("Musa",true)
    println("${married.name} is ${married.isMarried} ")

    //4
    val rectangle = Rectangle(44,44)
    println("Height ${rectangle.height} and Width ${rectangle.width} are ${rectangle.isSquare}")
    println("Random Height ${createRandomRectangle().height} and Random Width ${createRandomRectangle().width} are ${createRandomRectangle().isSquare}")

    //5 enum class
    println(getMnemonic(Color.BLUE))

    //6 Range Number
    var numbers = 1..20
    for (number in numbers){
        print("$number, ")
    }
    println()

    //7 Range Character
    var alpha:CharRange = 'A'..'Z'
    for (alphas in alpha){
        print("$alphas, ")
    }
    println()

    //8 Range
    println(recognize('o'))

    //9 Collection
    val position = listOf("one","two","three","four")
    println("$position: Last Value: ${position.last()}")
    val nums  = setOf(1,2,3,50,500,10000)
    println("$nums: Maximum Number: ${nums.max()}")

    //10 extension functions and properties displays last Character
    println("Kotlin".lastChar())

    //11 Split
    println("Initial Value 12.345-6.7.8.9-1-3/5 "+"Split values: 12.345-6.7.8.9-1-3/5".split(".", "-","/"))


}

//extension functions and properties
fun String.lastChar(): Char = get(length - 1)

//in operator to check whether a value is in a range, or its opposite
fun recognize(c: Char) =
    when(c){
        in '0'..'9' -> "Its a digit"
        in 'a'..'z', in 'A'..'Z' -> "Its a Letter"
        else -> "I don't Know"

    }

enum class Color {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

fun getMnemonic(color: Color) =
    when (color) {
        Color.RED, Color.ORANGE, Color.YELLOW -> "Warm Weather"
        Color.GREEN -> "Neutral Weather"
        Color.BLUE, Color.INDIGO, Color.VIOLET -> "Cold Weather"
    }


class Rectangle(val height: Int, val width: Int){
    val isSquare: Boolean
    get() = height == width
}

fun createRandomRectangle(): Rectangle{
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}

data class Mutane(val name: String, val age: Int? = null)

class Married(val name: String, var isMarried: Boolean)

fun max(a: Int, b: Int) = if( a > b) a else b
