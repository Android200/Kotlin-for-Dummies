import java.time.Instant

fun main(){

    val t = time { println("Lots of Code")}
    println(t)

}
//inline functions
/*
*  If we use the inline keyword on a function, we tell the compiler to
 *  inline both the function and its lambda parameters (if any) - that
 *  is, the compiler will copy the code of the function (and its lambda
 *  parameters) into every callsite, thus eliminating the overhead of
 *  both the lambda instantiation and the calling of the function and
 *  the lambdas.
* */
inline fun time(action: () -> Unit): Long{
    val start = Instant.now().toEpochMilli()
    println("Lots of code")
    return Instant.now().toEpochMilli() - start
}