package Kotlin_in_Action_Kotlin

import java.lang.StringBuilder

fun main(){
    //1 Defining a simple higher-order function
    twoAndThree { a, b -> a + b }
    twoAndThree { a, b -> a * b }

    //2 Implementing a simple version of the Kotlin_in_Action_Photo.filter function
    println("ab1234c".filter { it in 'a'..'z' })

    //4 Control flow in higher-order functions
    //Using return in a regular loop
    val people = listOf(Personnel("Alice", 29), Personnel("Bob", 31))

    //Using return in a regular loop
    lookForAlice1(people)
    //Using return in a lambda passed to forEach
    lookForAlice2(people)
    //Using a local return with a label
    lookForAlice3(people)
    //Using the function name as a return label
    lookForAlice4(people)
    //Using return in an anonymous function
    lookForAlice5(people)



}

//4 Control flow in higher-order functions
//Using return in a regular loop
data class Personnel(val name: String, val age: Int)


//Using return in a regular loop
fun lookForAlice1(people: List<Personnel>){
    for(mutane in people){
        if(mutane.name == "Alice"){
            println("Found!")
            return
        }
    }
    println("Alice is not found")
}

//Using return in a lambda passed to forEach
fun lookForAlice2(people: List<Personnel>){
    people.forEach {
        if(it.name == "Alice"){
            println("Found!")
            return
        }
    }
    println("Alice is not found")
}

//Using a local return with a label
fun lookForAlice3(people: List<Personnel>){
    //return@label refers to this label.
    people.forEach label@ {
        if (it.name == "Alice") return@label
    }
    println("Alice might be somewhere")
}

//Using the function name as a return label
fun lookForAlice4(people: List<Personnel>){
    //return@forEach returns from the lambda expression.
    people.forEach {
        if(it.name == "Alice") return@forEach
    }
    println("Alice might be somewhere")
}

//Using return in an anonymous function
fun lookForAlice5(people: List<Personnel>){
    //Uses an anonymous function instead of a lambda expression
    people.forEach (fun (person){
        if (person.name == "Alice") return
        println("${person.name} is not Alice!")
    })
}


//3 Using function types from Java
fun processTheAnswerToJava(f: (Int) -> Int){
    println(f(42))
}

//2 Implementing a simple version of the Kotlin_in_Action_Photo.filter function
fun String.filter(predicate: (Char)-> Boolean): String{
    val sb = StringBuilder()
    for (index in 0 until length){
        val element = get(index)
        if (predicate(element))sb.append(element)
    }
    return sb.toString()
}

//1 Defining a simple higher-order function
fun twoAndThree(operation: (Int, Int) -> Int){
    val result = operation(2,3)
    println("The result is $result")
}



