package Kotlin_Tutorial_Point

fun main(){

    //Function is declared with the keyword “fun”. Like any other OOP, it
    // also needs a return type and an option argument list.

    //1 Function
    //fun <nameOfFunction>(<argument>:<argumentType>):<ReturnType>
    println(MyFunction("tutorialsPoint.com"))
    println()

    //2 Lambda Function
    //Lambda is a high level function that drastically reduces the boilerplate
    // code while declaring a function and defining the same.
    //In Kotlin, you can declare your lambda and pass that lambda to a function.
    val mylambda :(String) -> Unit = {s:String -> print(s)}
    val v:String="Kotlin for beginners"
    mylambda(v)
    println()

    //3 Inline Function
    //Now, we can pass a lambda to another function to get our output which makes
    //the calling function an inline function.
    val mylambdas:(String)->Unit ={s:String->print(s)}
    val v1:String="Kotlin for beginners 2"
    myFun(v1,mylambdas)


}
//3 Inline Function
fun myFun(a: String, action: (String)->Unit){
    print("Heyyy!!! ")
    action(a)
}

//1 Function
fun MyFunction(x: String): String {
    var c:String ="Hey!! Welcome To --- "
    return (c+x)
}
