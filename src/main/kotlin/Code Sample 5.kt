fun main(){

    val strings = listOf("Anne", "Karen", "Peter") // List<String>

    /*The word to in this line of code isn’t a built-in construct, but rather a
      method invocation of a special kind, called an infix call*/

    val map = mapOf("a" to 1, "b" to 2, "c" to 3)  // Map<String, Int>

    val set = setOf("a", "b", "c")                 // Set<String>

    for (string in strings){
        print("$string, ")
    }

    println()

    for ((i, string) in strings.withIndex() ){
        println("$i: $string")
    }

    println()

    // Note that to is an infix function that creates a Pair containing a key and a value, from which the map is constructed.

    val stringss = mutableListOf("Anne", "Karen", "Peter")

    val maps = mutableMapOf("a" to 1, "b" to 2, "c" to 3)

    val sets = mutableSetOf("a", "b", "c")

    //Empty Collections
    val noInts: List<Int> = listOf()

    val noStrings = listOf<String>()

    val emptyMap = mapOf<String, Int>()

    // The types inside the angle brackets are called generic type parameters,

    repeat(3){
        println("hello kotlin")
    }

    for (x in 0..10) print("$x, ") // Prints 0 through 10 (inclusive)
    println()

    for (x in 0 until 10) print("$x, ") // Prints 0 through 9
    println()

    for (x in 0 until 10 step 2) print("$x, ") // Prints 0, 2, 4, 6, 8
    println()

    for (x in 10 downTo 0 step 2) print("$x, ") // Prints 10, 8, 6, 4, 2, 0
    println()

    /*A label is an identifier followed by @, e.g. outer@ (possibly followed by a space).*/
    outer@ for (n in 2..100) {
        for (d in 2 until n) {
            if (n % d == 0) continue@outer
        }
        println("$n is prime")
    }







}