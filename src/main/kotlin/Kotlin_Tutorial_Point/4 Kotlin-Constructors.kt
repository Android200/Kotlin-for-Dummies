package Kotlin_Tutorial_Point

fun main(){
    //Kotlin has two types of constructor - one is the primary constructor and the other is the secondary constructor.
    //One Kotlin class can have one primary constructor, and one or more secondary constructor.
    //Java constructor initializes the member variables, however, in Kotlin the primary constructor initializes-
    //- the class, whereas the secondary constructor helps to include some extra logic while initializing the same.

    //1 Constructor
    val person1 = Person("Saidu", 12)

    println("First Name = ${person1.firstName}")
    println("First Name = ${person1.age}")//2 Constructor
    println()

    // This secondary constructor is created using the “constructor” keyword. It is required whenever you want to
    // create more than one constructor in Kotlin or whenever you want to include more logic in the primary
    // constructor and you cannot do that because the primary constructor may be called by some other class.

    //2 Constructor
    val human1 = Humans("Musa", 20)
    println("${human1.message} ${human1.firstName} welcome to example of Secondary " +
            "constructor, Your Age is - ${human1.age}")
}

//1 Comstructor
class Person(val firstName: String, var age: Int)

//2 Constructor
class Humans (val firstName: String, var age: Int){

    val message:String = "Hey!!!"

    constructor(name: String, age:Int, message:String):this(name,age)
}