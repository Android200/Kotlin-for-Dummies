package Kotlin_Tutorial_Point
fun main(){
    //1 If-Else
    val a:Int= 5
    val b:Int= 2

    var max:Int

    if(a>b){
        max = a
    }else{
        max = b
    }
    println("Maximum of $max")
    println("Detecting Maximum using function ${bigger(a,b)}")

    println()
    //1 If-Else Method 2
    val maximum = if(a > b) a else b
    println(maximum)

    println()
    //2 When (Switch statement in Java)
    val x:Int=5

    when(x){
        1 -> print("x == 1")
        2 -> print("x == 2")
        else ->{
            println("x is neither 1 or 2")
        }
    }
    println()
    //2 When (Switch statement in Java) Method 2
    when(x){
        1,2 -> ("Value of X either 1,2")
        else ->{
            println("x is neither 1 nor 2")
        }
    }
    println()

    //3 For Loop
    val items = listOf(1,2,3,4)
    for(i in items){
        println("Values of the array $i")
    }
    println()

    //3 For Loop Method 3
    val item = listOf(1, 22, 83, 4)
    for ((index, value) in item.withIndex()){
        println("The element at $index is $value")
    }
    println()

    //4 While Loop
    var y: Int=0
    println("Example of While Loop--")
    while (y<=10){
        println(y)
        y++
    }
    println()

    //5 Do While Loop
    var w:Int=0
    do{
        w += 10
        println("I am inside DO block--- $w")
    }while (w<=50)

    println()
    //6 Repeat Returns a string containing this char sequence repeated n times. Kotlin 1.3
    repeat(3) {
        println("Hello")
    }

    println("Word, ".repeat(4))
    println()

    //7 Return: Return is a keyword that returns some value to the calling function from the called function.
    var m: Int = 10
    println("The Value of X is -- ${doubleMe(m)}")
    println()

    //8 Continue & Break: “break” keyword terminates the controller flow if some condition has failed.
    // “continue” does the opposite. the developer can apply more than one label as visibility.
    myLabel@ for(n in 1..10){
        if(n==5){
            println("I am inside if block with value $n -- hence it will close the operation")
            break@myLabel
        }else{
            println("I am inside else block with value $n")
            continue@myLabel
        }
    }


}

//7 Return: Return is a keyword that returns some value to the calling function from the called function.
fun doubleMe(m:Int):Int{
    return 2*m
}

fun bigger(a: Int, b: Int) = if (a > b) a else b