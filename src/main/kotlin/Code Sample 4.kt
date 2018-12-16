fun main(){
    val x = 42
    when (x) {
        0 -> println("zero")
        in 1..9 -> println("single digit")
        else -> println("multiple digits")
    }

    var y = 0
    while (y < 10) {
        println(y)
        y++ // Same as x += 1
    }


}