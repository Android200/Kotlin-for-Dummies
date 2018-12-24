package Kotlin_Tutorial_Point

import kotlin.properties.Delegates

fun main(){

    //Delegation
    /**
     *Kotlin supports “delegation” design pattern by introducing a new keyword “by”. Using this
      keyword or delegation methodology, Kotlin allows the derived class to access all the
      implemented public methods of an interface through a specific object.
     */

    //1 Delegation
    val b = BaseImpl(10)
    Derived(b).printMe()
    println()

    //Property Delegation
    //Delegation means passing the responsibility to another class or method. When a property
    //is already declared in some places, then we should reuse the same code to initialize them

    //2 Using Lazy()
    //Lazy is a lambda function which takes a property as an input and in return gives an
    //instance of Lazy<T>, where <T> is basically the type of the properties it is using.
    println("$myVar My Dear Friend")
    println()

    //3 Delegetion.Observable()
    //Observable() takes two arguments to initialize the object and returns the same to the called function.
    val user = User()
    user.name = "first"
    user.name = "second"

}
//3 Delegetion.Observable()
class User{
    var name: String by Delegates.observable("Welcome to Android for Beginners"){
        prop, old, new ->
        println("$old -> $new")
    }
}

//2 Using Lazy()
val myVar: String by lazy{
    "Hello"
}

//1 Delegation
interface Base{
    fun printMe()
}

class BaseImpl(val x: Int): Base {
    override fun printMe() {
        println(x) //implementation of the method
    }
}
class Derived(b: Base) : Base by b // delegating the public method on the
object b