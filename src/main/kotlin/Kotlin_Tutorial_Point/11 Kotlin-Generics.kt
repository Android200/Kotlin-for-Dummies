package Kotlin_Tutorial_Point

fun main(){

    //Generics
    /**
     *  Kotlin provides higher order of variable typing called as Generics. In this
        chapter, we will learn how Kotlin implements Generics and how as a developer we can use
        those functionalities provided inside the generics library. Implementation wise, generics is
        pretty similar to Java but Kotlin developer has introduced two new keywords “out” and
        “in” to make Kotlin codes more readable and easy for the developer.
        In Kotlin, a class and a type are totally different concepts. As per the example, List is a
        class in Kotlin, whereas List<String> is a type in Kotlin.
     */

    //1 GENERIC
    val integer: Int = 1
    //This is possible because “Int” is a subclass of Number class,hence the type
    // conversion happens automatically at runtime and produces the output as “1”.
    val number: Number = integer
    println(number)
    println()

    //2 GENERIC <T> where T stands for Template
    genericsExample<String>("JAVA")
    genericsExample<Int>(10)

}

//2 GENERIC <T> where T stands for Template

//When we want to assign the generic type to any of its super type, then we need to use
//“out” keyword, and when we want to assign the generic type to any of its sub-type, then
//we need to use “in” keyword.
class genericsExample<out T>(input:T){
    init {
        println("I am getting called with the value $input")
    }
}