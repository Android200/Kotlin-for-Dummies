package Kotlin_in_Action_Kotlin

import java.time.LocalDate
import java.time.Period

fun main (args: Array <String>){
    //1 Calling a generic function
    val letters = ('a'..'z').toList()
    println(letters.slice<Char>(0..2))
    println(letters.slice(10..13))

    //2 Using a type check with a known type argument
    println(listOf(1,2,3).sum())
    printSum(listOf(1, 2, 3))

    //3 Using the filterIsInstance standard library function
    val items = listOf("one", 2, "three", 3, 4, 'a', 'z', 'b', 9.2, 3.0, 6.0, 5.5)
    println(items.filterIsInstance<String>())
    println(items.filterIsInstance<Int>())
    println(items.filterIsInstance<Char>())
    println(items.filterIsInstance<Double>())

    //4 Star projection: using * instead of a type argument
    printFirst1(listOf("Svetlana", "Dmitry", 1, 2, 3, 4, 5))
    printFirst2(listOf("Svetlana", "Dmitry", 1, 2, 3, 4, 5))

    //5 Defining an invoke method in a class
    val hausaGreeter = Greeter("Ina Kwa na")
    hausaGreeter("Mustapha")

    //6 Defining a date manipulation DSL (Domain Specific language)
    println(1.days.ago)
    println(1.days.fromNow)



}
//6 Defining a date manipulation DSL (Domain Specific language)
val Int.days:Period get() = Period.ofDays(this)
val Period.ago: LocalDate get() = LocalDate.now() - this
val Period.fromNow: LocalDate get() = LocalDate.now() + this


//5 Defining an invoke method in a class
class Greeter(val greeting:String){
    operator fun invoke(name:String){
        println("$greeting, $name")
    }
}

//4 Star projection: using * instead of a type argument
fun printFirst1(list: List<*>){
    if(list.isNotEmpty()) {
        println(list.first())
        println(list.last())
    }
}

fun <T> printFirst2(list: List<T>){
    if (list.isNotEmpty()){
        println(list.first())
        println(list.last())
    }
}

//2 Using a type check with a known type argument
fun printSum(c: Collection<Int>){
    if(c is List<Int> ){
        println(c.sum())
    }
}
