package Kotlin_Tutorial_Point

fun main(){

     // inheritance means accruing some properties of the mother class into the child class.
    // In Kotlin, the base class is named as “Any”, which is the super class of the ‘any’
    // default class declared in Kotlin. Like all other OOPS, Kotlin also provides this
    // functionality using one keyword known as “:”.
    //Everything in Kotlin is by default final, hence, we need to use the keyword “open”
    // in front of the class declaration to make it allowable to inherit.

    //1 Inheritance
    var a = BCD().think()
    println(a)
    println()

    //2 Inheritance
    var b = B().think()
    println(b)



}

//2 Inheritance
open class A{
    open fun think() = "Hey i am thinking"
}

class B:A(){
    override fun think() = "I am from child"
}

//1 Inheritance
open class ABC{
    fun think() = "Hey!! i thinking"
}

class BCD:ABC()