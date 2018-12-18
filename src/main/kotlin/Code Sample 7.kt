import java.lang.IllegalArgumentException

fun main(){
    //1
    val a = Person()

    val b = Person()

    println("${a.age} ${b.age}")

    a.age = 43

    println("${a.age} ${b.age}")

    //2
    val human = Mutun("Umar","Saidu",1993)
    println("${human.fullName} is ${human.age}")

    //3
    val h = Persons("John Doe", 20)
    println("${h.name} is ${h.age}")

    //4
    val x = Humans(65)
    println("${x.age}")

    //5
    val y = function_in_Class("John Doe")
    y.present()

    //6 infix function
    val John = function_in_Class("John Woe")
    val Mary = function_in_Class("Mary Woe")
    John marry Mary
    John + Mary

    //7
    callAndPrint { numerator, denominator ->
        if (denominator == 0) 0.0 else numerator.toDouble()
    }

    //8
    callWitPi { it * it }

    //9
    val boast: Car.() -> String = { "I'm a car with $horsepowers HP"}
    val car = Car(120)
    println(car.boast())


}
//Receivers The signature of a member function or an extension function begins with a receiver
class Car(val horsepowers: Int)

//Function literals: lambda expressions and anonymous functions
fun callWitPi(function: (Double) -> Double){
    println(function(3.14))
}

fun callAndPrint(function: (Int,Int)-> Double){
    println(function(2,0))
}

class function_in_Class(val name:String?){
    fun present(){
        println("Hello, I'm $name")
        println()
    }

    infix fun marry(spouse:function_in_Class){
        println("$name and ${spouse.name} are getting married")
    }

    operator fun plus( spouse: function_in_Class){
        println("$name and ${spouse.name} are getting married")
    }


}

class Humans(age: Int){
    var age = 0
    set(value){
        if(value < 0) throw IllegalArgumentException("Age cannot be negative")
        field = value
    }
    init {
        this.age = age
    }
}

class Persons(val name: String, var age: Int)

class Person{
    var name = "John Doe"
    var age = 32
}

/*Constructors and initializer blocks
* Properties that don’t have a sensible default
* should be taken as constructor parameters.
* */
class Mutun(firstName: String, lastName: String, Year_birth: Int){
    val fullName = "$firstName $lastName"
    var age: Int
    init {
        age = 2018 - Year_birth
    }
}

