package Kotlin_in_Action_Kotlin

import Kotlin_in_Action_Java.JavaCollectionsUtils
import java.math.BigDecimal

fun main(){

    //1 Using nullable primitive types
    println(My_People("Sam", 35).isOlderThan(My_People("Amy", 42)))
    println(My_People("Sam", 35).isOlderThan(My_People("Jane")))

    //2 Kotlin Collections
    val list = listOf("a", "b", "c", "d")
    printInUppercase(list)

    //3 Kotlin Empty Array
    val squares = IntArray(5) { i -> (i+1)}
    val squaress = IntArray(5) { i -> (i+1) * (i+1)}

    println(squares.joinToString())
    println(squaress.joinToString())

    //4 Overloading arithmetic operators (plus operator)
    val p1 = Point(10, 20)
    val p2 = Point(30, 40)
    println(p1 + p2)

    //4 Overloading arithmetic operators (Kotlin_in_Action_Photo.times operator)
    val p = Point(10, 20)
    //Destructuring declarations and component functions
    val(x,y) = p
    println(p * 1.5)
    println(p)
    println("Destructuring declarations and component functions= $x")
    println("Destructuring declarations and component functions= $y")

    //4 Overloading arithmetic operators (Kotlin_in_Action_Photo.times operator)
    println('a' * 8)

    //5 Overloading arithmetic operators (plus operator)
    var point = Point(1, 2)
    point += Point(3, 4)
    println(point)

    //6 Overloading compound assignment operators
    val lists = arrayListOf(1,2)
    lists += 3
    val newList = lists + listOf(4,5)
    println(lists)
    println(newList)

    //7 Overloading unary operators
    val Pn= Point(10, 20)
    println(-Pn)

    //8 Defining an increment operator
    var bd = BigDecimal.ZERO
    println(bd++)
    println(++bd)

    //9 Ordering operators: compareTo
    println(2.compareTo(2) >= 30)

    //10 Accessing elements by index: “Kotlin_in_Action_Photo.get” and “set”
    //Implementing the Kotlin_in_Action_Photo.get convention
    val dot1 = Point(10, 20)
    println(dot1[1])
    println(dot1)

    //11 Accessing elements by index: “Kotlin_in_Action_Photo.get” and “set”
    //Implementing the set convention
    val dot2 = MutablePoint(10, 20)
    dot2[1] = 42
    println(dot2)

    //12 Using a destructuring declaration to return multiple values
    val (name,ext) = splitFilename("EXAMPLE.kt")
    println(name)
    println(ext)

    //13 Using a destructuring declaration to iterate over a map
    val map = mapOf("Oracle" to "Java", "JetBrains" to "Kotlin")
    printEntries(map)


}


//13 Using a destructuring declaration to iterate over a map
fun printEntries(map: Map<String, String>){
    for((key,value) in map){
        println("$key -> $value")
    }
}

//12 Using a destructuring declaration to return multiple values
data class NameComponents(val name: String, val extension: String)

fun splitFilename(fullName:String): NameComponents {
    val result = fullName.split('.', limit = 2)
    return NameComponents(result[0], result[1])
}


//11 Implementing the Kotlin_in_Action_Photo.get convention
data class MutablePoint(var x:Int, var y:Int)

operator fun MutablePoint.set(index:Int, value:Int){

    when(index){
        0 -> x = value
        1 -> y = value
        else ->
            throw IndexOutOfBoundsException("Invalid coordinate $index")

    }
}

//10 Accessing elements by index: “Kotlin_in_Action_Photo.get” and “set”
//Implementing the Kotlin_in_Action_Photo.get convention
operator fun Point.get(index:Int):Int{

    return when(index){
        0 -> x
        1 -> y
        else ->
            throw IndexOutOfBoundsException("Invalid coordinate $index")
            //println("Invalid coordinate $index")
    }
}

//8 Defining an increment operator
operator fun BigDecimal.inc() = this + BigDecimal.ONE

//7 Overloading unary operators
operator fun Point.unaryMinus(): Point {

    return Point(-x, -y)
}

//4 Overloading arithmetic operators (plus operator)
data class Point(val x: Int, val y: Int) {

    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }

    operator fun times(scale: Double): Point {
        return Point((x * scale).toInt(), (y * scale).toInt())
    }
}
operator fun Char.times(count: Int):String{

    return toString().repeat(count)
}

//2 Kotlin Collections
fun printInUppercase(list: List<String>){

    println(JavaCollectionsUtils.uppercaseAll(list))
    println(list.first())
}

//1 Using nullable primitive types
data class My_People(val name: String, val age: Int? = null){

    fun isOlderThan(other: My_People): Boolean?{
        if(age == null || other.age == null)
            return null
        return age > other.age
    }
}

