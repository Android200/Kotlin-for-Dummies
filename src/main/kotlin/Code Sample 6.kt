fun main(){

    val greetings = happyBirthday("Musa", 12)
    val square = square(20)
    println(greetings)
    println(square)

    val count = listOf(1,2,3)
    countAndprintArgs(*count.toIntArray())



}

fun happyBirthday(name:String, age:Int):String{

    return "Happy ${age}th birthday, $name!"
}

fun square(number:Int) = number * number
fun square(number: Double) = number * number

//vararg = Variable number of arguments
fun  countAndprintArgs(vararg numbers: Int){
    println(numbers.size)
    for (number in numbers) println(number)

}
