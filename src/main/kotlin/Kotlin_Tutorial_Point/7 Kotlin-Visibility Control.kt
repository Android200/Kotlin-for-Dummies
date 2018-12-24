package Kotlin_Tutorial_Point

fun main(){
    //Access modifier is used to restrict the usage of the variables, methods and class used in the
    //application. There are four access modifiers available in Kotlin.

    //Private
    /**
     Once anything is declared as private, then it will be accessible within its immediate scope. For
     instance, a private package can be accessible within that specific file. A private class or
     interface can be accessible only by its data members, etc
     **/
    val privateEx = privateExample()
    println(privateEx.doSomething())
    println()

    //Protected : A protected class or interface is visible to its subclass only
    println(BB().doSomthing())
    println(BB().getValue())
    println()

    //Internal
    /**
     *Internal An Internal package is visible only inside the module under which it is implemented. An internal class interface is visible only by
      other class present inside the same package or the module.
     */
    println( internalExample().doSomething())
    println()

    //Public: Public modifier is accessible from anywhere in the project workspace.
    println(publicExample().doSomething())

}
//private
private class privateExample {
    private val i = 110

    fun doSomething(){    // if you declare method private, it won't actually see it when you are
        println("$i Private Class")
    }
}

//protected
open class AA {
    protected val i = 1
    protected val name = "Saidu"
}
class BB : AA() {
    fun doSomthing() = "Protected Class"
    fun getValue() : Int{
        return i
    }
}

//internal
class internalExample {
    internal val i = 1
    internal fun doSomething()= "$i Internal Class"
}

//public
class publicExample {
    val i = 1
    fun doSomething() = "$i Public class"
}