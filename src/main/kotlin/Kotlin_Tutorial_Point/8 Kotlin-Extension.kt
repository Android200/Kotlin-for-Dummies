package Kotlin_Tutorial_Point

fun main(){

    //Extension
    /**
     * Using extension, we will be able to add or remove some method functionality even without
       inheriting or modifying them. Extensions are resolved statistically. It does not actually
       modify the existing class, but it creates a callable function that can be called with a dot
       operation.
     */
    //1 Function Extension
    var a1 = Alien()
    a1.skills = "JAVA"
    a1.printMySkills()

    var a2= Alien()
    a2.skills="SQL"

    var a3= Alien()
    a3.skills=a1.addMySkills(a2)
    a3.printMySkills()
    println()

    //2 Object Extension
    /**
     * Kotlin provides another mechanism to implement static functionality of Java. This can be
       achieved using the keyword “companion object”. Using this mechanism, we can create an
       object of a class inside a factory method and later we can just call that method using the
       reference of the class name.
     */
    println("Heyyy ${Z.show()}")



}

//2 Object Extension
class Z{
    companion object {
        fun show():String{
            return("You are learning Kotlin for Beginners")
        }
    }
}

//1 Function Extension
class Alien{
    var skills : String="null"
    fun printMySkills() = println(skills)
}

fun Alien.addMySkills(a: Alien):String{
    var a4 = Alien()
    a4.skills = this.skills + " " + a.skills
    return a4.skills
}