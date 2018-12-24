package Kotlin_Tutorial_Point

import java.util.*

fun main(){

    //Using readline
    println("Enter Your name")
    val StringInput = readLine().toString()
    println("Welcome $StringInput")
    println()

    //Using Java Scanner
    val Keyboard = Scanner(System.`in`)
    println("Enter Your Age")
    var age : Int = Keyboard.nextInt()
    println("Your Age is $age")
    println()

    //Age Calculator Example using readLine
    try {
        var name: String
        var birth_year: Int?
        var current_year = 2018
        var FINAL_AGE:Int

        println("Age Calculator")
        println("Enter Your name:")
        name = readLine().toString()

        println("Enter Your Year of Birth")
        birth_year = readLine()?.toInt()

        FINAL_AGE = current_year - birth_year!!

        println("$name your Age is $FINAL_AGE")
    }catch (e: Exception){
        e.printStackTrace()
    }






}