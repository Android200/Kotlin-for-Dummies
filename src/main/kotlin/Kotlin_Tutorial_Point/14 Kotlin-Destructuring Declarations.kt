package Kotlin_Tutorial_Point

fun main(){
    //Destructuring Declarations
    //It allows you to declare multiple variables at once.
    // This technique is called Destructuring declaration.

    // 1 Destructuring Declarations
    val s=Student("TutorialsPoint.com", "Koltin")
    val (name,subject) = s
    println("You are learning $subject from $name")


}
data class Student(val a:String, val b: String){
    var name: String = a
    var subject: String = b
}