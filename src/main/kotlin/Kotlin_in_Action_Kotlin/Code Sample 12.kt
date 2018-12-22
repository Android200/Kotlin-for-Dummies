package Kotlin_in_Action_Kotlin

fun main(){
    //Lazy Collection operations

    //1 Searching through a collection using lambdas
    val people = listOf(
        Personal("Alice", 30),
        Personal("Bob", 31),
        Personal("Carol", 31),
        Personal("Dan", 21)
    )
    //Using Kotlin_in_Action_Photo.filter
    println(people.map (Personal::name).filter { it.startsWith("B") })

    //Using sequences: use a sequence whenever you have a chain of operations on a large collection.
    println(people.asSequence().map(Personal::name).filter { it.startsWith("B") }.toList())

    println(people.asSequence().filter { it.name.length < 4 }.map (Personal::name).toList() )

    //1 Nullability Safe Calls
    println(printAllCaps("abc"))
    println(printAllCaps(null))

    //2 Nullability Safe Calls
    val ceo = Employee("Da Boss", null)
    val developer = Employee("Bob Smith", ceo)
    println(managerName(developer))
    println(managerName(ceo))

    //3 Nullability Chaining multiple safe-call operators
    val person = Personss("Dmitry", null)
    println(person.countryName())

    //4 Nullability Elvis operator: “?:” or the null-coalescing operator,
    //Kotlin has a handy operator to provide default values instead of null
    //Using throw together with Elvis operator
    val address = Address("Elsestr. 47", 80687, "Munich", "Germany")
    val jetbrains = Company("JetBrains", address)
    val personss = Personss("Dmitry", jetbrains)
    printShippingLabel(personss)
    printShippingLabel(Personss("Alexey", null))

    //5 Assertion !! Using a not-null assertion
    ignoreNulls(null)


}

//5 Assertion !! Using a not-null assertion
fun ignoreNulls(s: String?){
    val sNotNull: String = s!!
    println(sNotNull.length)
}

//3 Nullability Chaining multiple safe-call operators
class Address(val streetAddress: String, val zipCode: Int, val city: String, val country: String )

class Company(val name:String, val address: Address?)

class Personss(val name:String, val company: Company?)

//Elvis operator
fun Personss.countryName():String =  company?.address?.country ?: "Unknown"

//Using throw together with Elvis operator
fun printShippingLabel(personss: Personss){
    val address = personss.company?.address ?: throw IllegalArgumentException("No Address")
    with(address){
        println(streetAddress)
        println("$zipCode $city, $country")
    }
}



//1 Nullability Safe Calls
fun printAllCaps(s: String?) {
    val allCaps: String? = s?.toUpperCase()
    println(allCaps)
}

//2 Nullability Safe Calls
class Employee(val name: String, val manager: Employee?)

//2 Nullability Safe Calls
fun managerName(employee: Employee): String? = employee.manager?.name





