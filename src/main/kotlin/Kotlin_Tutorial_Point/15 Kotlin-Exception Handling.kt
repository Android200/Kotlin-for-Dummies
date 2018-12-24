package Kotlin_Tutorial_Point

fun main(){
    //Exception Handling
    //The exceptions in Kotlin is pretty similar to the exceptions in Java.
    //All the exceptions are descendants of the “Throwable” class.

    try {

        val myVar:Int=12
        val v:String="Tutorialspoint.com"
        v.toInt()

    }catch (e: Exception){
        e.printStackTrace()

    }finally {
        println("Exception Handling in Kotlin")
    }


}