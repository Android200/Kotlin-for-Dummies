package Kotlin_Tutorial_Point

fun main(){
    //Sealed Class
    /**
     * This type of class is used to represent a restricted class hierarchy. Sealed allows the developers to
       maintain a data type of a predefined type. To make a sealed class, we need to use the
       keyword “sealed” as a modifier of that class. A sealed class can have its own subclass but
       all those subclasses need to be declared inside the same Kotlin file along with the sealed class.
     */

    val obj: MyExample = MyExample.OP2()
    val obj2: MyExample = MyExample.OP1()

    val output = when (obj) { // defining the object of the class depending on the inuputs

        is MyExample.OP1 -> "Option One has been chosen"
        is MyExample.OP2 -> "option Two has been chosen"
    }
    println(output)

    val outputs = when (obj2) { // defining the object of the class depending on the inuputs

        is MyExample.OP1 -> "Option One has been chosen"
        is MyExample.OP2 -> "option Two has been chosen"
    }
    println(outputs)

}

sealed class MyExample {
    class OP1 : MyExample() // MyExmaple class can be of two types only
    class OP2 : MyExample()
}