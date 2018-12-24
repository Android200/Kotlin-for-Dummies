package Kotlin_Tutorial_Point

fun main(args:Array<String>){
    //Interface they can contain method implementation as well as abstract methods
    // declaration. An interface can be implemented by a class in order to use its defined functionality.

    //1 Interface
    val obj = InterfaceClass1()

    println("My Variable Value is = ${obj.myVar}")
    println("Calling hello(): ${obj.Hello()}")
    println("Message to New Kotliners-- ${obj.absMethos()}")
    println()

    //Kotlin doesn’t support multiple inheritances, however, the same thing can be achieved
    // by implementing more than two interfaces at a time.

    //2 Inheritance
    val obj2 = InterfaceClass2()
    println(obj2.printMe())
    println(obj2.printMeToo())


}

//2 Inheritance
interface X{
    fun printMe() = "Method of Interface X"
}

interface Y{
    fun printMeToo() = "I am another Method from Interface Y"
}

class InterfaceClass2: X,Y

//1 Interface
interface InterfaceDemo1{
    var myVar:Int  //abstract property

    fun absMethos():String   //abstract method

    fun Hello() = "Hello there Welcome to Kotlin for Beginners"  //method with default implementation

}

class InterfaceClass1 : InterfaceDemo1{
    override var myVar: Int = 25
    override fun absMethos(): String = "Happy Learning"
}
