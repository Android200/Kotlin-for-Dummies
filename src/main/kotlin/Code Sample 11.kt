fun main(){
    //1 Classes objects and Interfaces
    Button().click()

    //2
    val button = Button()
    button.showOff()
    button.setFocus(true)
    button.click()

    //3 open modifier
    val richButton = RichButton()
    richButton.click()

    //4 primary constructor
    val users = Users("Jamilu",false)
    println("${users.nickname} is ${users.isSubScribed}")

    //5 Length Counter
    val lengthCounter = LengthCounter()
    lengthCounter.addWord(("Hello"))
    println(lengthCounter.counter)

    //6
    val client1 = Client("Alice",342562)
    println(client1)

    //7 companion object

    A.bar()

    //8 Searching through a collection using lambdas
    val people = listOf(Personal("Alice", 30),Personal ("Bob", 31), Personal("Carol", 31))
    findTheOldest(people)
    println(people.maxBy { it.age })
    println(people.minBy { it.age })
    println(people.filter { it.age > 30 })
    println(people.map { it.name })
    println(people.groupBy { it.age })

    //9 The map function applies the given function to each element in the collection and collects the results into a new collection.
    val list = listOf(1,2,3,4,5,6,7,8,9)
    println(list.map { it * it})

}

//lamdas and collections
data class Personal(val name: String, val age: Int)

//lamdas and collections
fun findTheOldest(people:List<Personal>){
    var maxAge = 0
    var theoldest: Personal? = null
    for (person in people){
        if(person.age > maxAge){
            maxAge = person.age
            theoldest = person
        }
    }
    println(theoldest)
}


// By declaring a companion object inside our class, you’ll be able to call its members with the same syntax as calling static methods in Java/C#
//The companion object has access to all private members of the class, including the private constructor, and it’s an ideal candidate to implement the Factory pattern.
class A{
    companion object {
        fun bar(){
            println("Companion object called")
        }
    }
}

class Client(val name: String, val postalCode: Int){
    override fun toString() = "Client(name=$name, postalCode=$postalCode"
}

//Length Counter
class LengthCounter{
    var counter: Int=0
    private set

    fun addWord(word:String){
        counter += word.length
    }
}

//primary constructor
//constructor keyword begins the declaration of a primary or secondary constructor.
//init keyword introduces an initializer block.
class Users constructor(_nickname: String,_isSubScribed: Boolean = true){
    val nickname: String = _nickname
    val isSubScribed = _isSubScribed
}

//open modifier
open class RichButton : Clickable{
    final override fun click() {
        //“final” isn’t redundant here because “override” without “final” implies being open.
        println("Rich Button")

    }
}

interface Clickable{
    fun click()
    fun showOff() = println("I'm clickable!")
}

interface Focusable{
    fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"} focus.")

    fun showOff() = println("I'm focusable")

}

class Button: Clickable, Focusable{
    override fun click() = println("I was clicked")

    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}
