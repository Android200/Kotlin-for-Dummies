package Kotlin_in_Action_Kotlin

import Kotlin_in_Action_Java.Java_People

fun main(){

    //3 coerceIn standard library function to restrict the value to the specified range
    showprogress(146)

    //1 Accessing a Java class with null checks
    yellAtSafe(Java_People(null))

    //2 Accessing a Java class without null checks
    yellAt(Java_People(null))


}

//3 coerceIn standard library function to restrict the value to the specified range
fun showprogress(progress: Int){
    val percent = progress.coerceIn(0,100)
    println("We're ${percent}% done!")
}

//1 Accessing a Java class with null checks
fun yellAtSafe(java_People: Java_People){
    println((java_People.name ?: "Anyone").toUpperCase() + "!!!")
}

//2 Accessing a Java class without null checks
fun yellAt(java_People: Java_People){
    println(java_People.name.toUpperCase() + "!!!")
}
