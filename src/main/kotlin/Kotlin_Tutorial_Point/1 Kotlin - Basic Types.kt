package Kotlin_Tutorial_Point

fun main(){
    val a: Int = 1000
    val d: Double = 100.00
    val f: Float = 100.00f
    val l: Long = 1000000004
    val s: Short = 10
    val b: Byte = 1
    val letter: Char = 'A'
    val letters: Boolean = true
    var name:String = "Umar"

    println("Your Int Value is $a")
    println("Your Double Value is $d")
    println("Your Float Value is $f")
    println("Your Long Value is $l")
    println("Your Short Value is $s")
    println("Your Byte Value is $b")
    println("$letter")
    println("Your character is $letters")
    println("I am $name")
    println()

    //Arrays
    //Arrays are a collection of homogeneous data.
    val numbers: IntArray = intArrayOf(1,2,3,4,5)
    for(number in numbers){
        println(number)
    }
    println("Calling Array ${numbers[2]}")
    println()

    //1 Collections
    /**
     * Kotlin has two types of collection - one is immutable collection
     * (which means lists, maps and sets that cannot be editable) and
     * another is mutable collection (this type of collection is editable).
     * In collection, Kotlin provides some useful methods such as first(), last(), filter(),
     * **/
    val num: MutableList<Int> = mutableListOf(1,2,3) // mutable List
    val readOnlyView: List<Int> = num               //immutable list
    println("my Immutable List-- $num")
    num.add(4)
    println("my immutable list after addition -- $num ")
    println("read only $readOnlyView")
    println()

    //2 Collections
    val items = listOf(1, 2, 3, 4)
    println(items)
    println("First Element of our list----"+items.first())
    println("First Element of our list----"+items.last())
    println("Even Numbers of our List----"+items.filter { it % 2 == 0 }) //returns [2, 4]
    println()

    //3 Colloections
    val readWriteMap = hashMapOf("foo" to 1, "bar" to 2)
    println(readWriteMap)
    println(readWriteMap["foo"]) // prints "1"
    println()

    //4 Collections
    val strings = hashSetOf("a", "b", "c", "c")
    println("My Set Values are $strings")
    println()

    //Ranges
    /* *
    * Ranges is another unique characteristic of Kotlin. Like Haskell, it provides
    * an operator that helps you iterate through a range. Internally, it is
    * implemented using rangeTo() and its operator form is (..).
    * */
    val i:Int =2

    for (j in 1..4){
        println(j) // prints "1234"
    }

    if (i in 1..10) { // equivalent of 1 <= i && i <= 10
        println("we found your number -- $i")
    }

}