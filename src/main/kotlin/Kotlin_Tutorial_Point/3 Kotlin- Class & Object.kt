package Kotlin_Tutorial_Point

fun main(){

    //1 Class
    val obj = myClass()
    obj.printMe()
    println()

    //2 Nested Class
    //In Kotlin, nested class is by default static, hence, it can be accessed without creating any object of that class.
    val demo = Outer.Nested().foo()
    println(demo)
    println()

    //3 Inner Class
    //An inner class can be accessed by the data member of the outer class
    val demo2 = Outers().Nested().foo()
    println(demo2)
    println()

    //4 Anonymous Inner Class
    //The concept of creating an object of interface using runtime object reference is known as anonymous class.
    var programmer: Human = object: Human{
        override fun think() {
            println("I am an example of Anonymous Inner Class")
        }
    }
    programmer.think()


}

//4 Anonymous Inner Class
//The concept of creating an object of interface using runtime object reference is known as anonymous class.
interface Human{
    fun think()
}



//3 Inner Class
// An inner class can be accessed by the data member of the outer class
class Outers{

    private val welcomeMessage: String = "Welcome to the TutorialsPoint.com"

    inner class Nested{
        fun foo() = welcomeMessage
    }
}


//2 Nested Class
//In Kotlin, nested class is by default static, hence, it can be accessed without creating any object of that class.
class Outer{

    class Nested{
        fun foo() = "Welcome to The TutorialsPoint.com"
    }
}

//1 Class

class myClass{

    private var name:String = "Tutorials.point"

    fun printMe(){
        println("You are at the best Learning website Named- $name")
    }
}

