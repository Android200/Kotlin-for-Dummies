-Frequently, you’ll find that during the lifetime of your variable, it only ever needs to refer to one object.
 Then, you can declare it with val (for “value”).

-The terminology is that var declares a mutable variable, and that val declares a read-only or assign-once variable - so both kinds are called variables.

-Type 	Bits 	Min value 	            Max value
 Long 	64 	    -9223372036854775808 	9223372036854775807
 Int 	32 	    -2147483648 	        2147483647
 Short 	16 	    -32768 	                32767
 Byte 	8 	    -128 	                127


-val result = if (condition) trueBody else falseBody

-Collections

 Arrays in Kotlin have a constant length, so one normally uses lists, which are similar to the ones in Python.
 What’s called a dict in Python is called a map in Kotlin (not to be confused with the function map()).
 List, Map, and Set are all interfaces which are implemented by many different classes.

-The while loop is similar to Python (but keep in mind that the condition must be an actual boolean
 expression, as there’s no concept of truthy or falsy values).

-A plain continue or break works the same way as in Python: continue skips to the next iteration of
 the innermost containing loop, and break stops the loop.

-The vararg keyword, which allows you to declare a function taking an arbitrary number of arguments

-A function declared inside a class is called a member function of that class.
-functions in Kotlin are first-class Citizens

-Visibility modifiers
 public (or omitted): this symbol is visible throughout the entire codebase
 internal: this symbol is only visible inside files that belong to the same module (a source code grouping which is defined by your IDE or build tool) as the file where this symbol is declared
 private: this symbol is only visible inside the file where this symbol is declared
 protected: this symbol is only visible inside the containing class and all of its subclasses, no matter where they are declared (so if your class is public and open, anyone can subclass it and thus get to see and use the protected members). If you have used Java: this does not also grant access from the rest of the package.

-Functional and object-oriented
 As a Java developer, you’re no doubt familiar with the core concepts of object-oriented
 programming, but functional programming may be new to you. The key concepts of
 functional programming are as follows:

  First-class functions—You work with functions (pieces of behavior) as values. You
 can store them in variables, pass them as parameters, or return them from
 other functions.

  Immutability—You work with immutable objects, which guarantees that their
 state can’t change after their creation.

  No side effects—You use pure functions that return the same result given the
 same inputs and don’t modify the state of other objects or interact with the outside world.

- val (from value)—Immutable reference. A variable declared with val can’t be
 reassigned after it’s initialized. It corresponds to a final variable in Java.

  var (from variable)—Mutable reference. The value of such a variable can be
 changed. This declaration corresponds to a regular (non-final) Java variable.

-an extension function is a simple thing: it’s a function that can be
 called as a member of a class but is defined outside of it.

-Lambda expressions, or simply lambdas, are essentially small chunks of code that can
 be passed to other functions. With lambdas, you can easily extract common code
 structures into library functions, and the Kotlin standard library makes heavy use of
 them. One of the most common uses for lambdas is working with collections.

-The with standard library function allows you to call multiple methods on the
 same object without repeating the reference to the object.

-apply lets you construct and initialize any object using a builder-style API.

-The let function makes it easier to deal with nullable expressions.

-Nullability is a feature of the Kotlin type system that helps you avoid
 NullPointerException errors. As a user of a program, you’ve probably seen an
 error message similar to “An error has occurred: java.lang.NullPointerException,”

-Nullability of type parameters <T>
 By default, all type parameters of functions and classes in Kotlin are nullable. Any type,
 including a nullable type, can be substituted for a type parameter; in this case,
 declarations using the type parameter as a type are allowed to be null, even though the type
 parameter T doesn’t end with a question mark.

- Integer types: Byte, Short, Int, Long
  Floating-point number types: Float, Double
  Character type: Char
  Boolean type: Boolean

-Any type is the supertype of all non-nullable types in Kotlin
 and is analogous to Java’s Object, Unit is an analogue of void.
 But in Java, Object is a supertype of all reference types only,
 and primitive types aren’t part of the hierarchy.
 val answer: Any = 42

-Unit type in Kotlin fulfills the same function as void in Java.
 It can be used as a return type of a function that has nothing interesting to return

-The Nothing type: “This function never returns"
 The Nothing type is used as a return type of functions that don’t terminate normally
 The Nothing type doesn’t have any values, so it only makes sense to use it as a
 function return type or as a type argument for a type parameter that’s used as a generic
 function return type.

 fun fail(message: String): Nothing {
 throw IllegalStateException(message)
 }
  fail("Error occurred")

-The in operator, which is used to check whether an object belongs to a collection.
 The corresponding function is called contains.

-The lazy function returns an object that has a method called getValue with the
 proper signature, so you can use it together with the by keyword to create a delegated
 property

-The lazy standard library function provides an easy way to implement lazily
 initialized properties.

-The Delegates.observable function lets you add an observer of property
 changes.

-delegated properties. This feature lets you easily implement properties that work in a more
 complex way than storing values in backing fields, without duplicating the logic in each accessor.
 For example, properties can store their values in database tables, in a browser session, in a map, and so on.

-By convention, the Delegate class must have getValue and setValue methods
 (the latter is required only for mutable properties).

-higher-order function is a function that takes another function as an argument or
 returns one.

-For example, the filter standard-library function takes a predicate
 function as an argument and is therefore a higher-order function:
 list.Kotlin_in_Action_Java.filter { x > 0 }

-When you declare a function as inline, its body is inlined—in other words, it’s substituted
 directly into places where the function is called instead of being invoked normally.

-Inline functions allow you to use non-local returns—return expressions placed in a lambda that
 return from the enclosing function.

-Anonymous functions provide an alternative syntax to lambda expressions with different rules for resolving
 the return expressions. You can use them if you need to write a block of code with multiple exit points.

-Generics allow you to define types that have type parameters. When an instance of such a type is created,
 type parameters are substituted with specific types called type arguments.

-The in keyword means values of the corresponding type are passed in to methods of this class and consumed by those methods.

-Using * star-projection syntax you can use to indicate that you have no information about a generic argument.

-Speaking about Java wildcards, MyType<*> in Kotlin corresponds to Java’s MyType<?>.

-In order to call a function, you need to know the class in which it was defined, as well as
 its name and parameter types. Annotations and reflection give you the power to go beyond that
 and to write code that deals with arbitrary classes that aren’t known in advance.

-The full list of supported use-site targets is as follows:

  property—Java annotations can’t be applied with this use-site target.
  field—Field generated for the property.
  Kotlin_in_Action_Java.get—Property getter.
  set—Property setter.
  receiver—Receiver parameter of an extension function or property.
  param—Constructor parameter.
  setparam—Property setter parameter.
  delegate—Field storing the delegate instance for a delegated property.
  file—Class containing top-level functions and properties declared in the file.

-Others are used to change how Kotlin’s declarations are visible to Java callers:

  @JvmName-changes the name of a Java method or field generated from a Kotlin declaration.
  @JvmStatic-can be applied to methods of an object declaration or a companion object to expose them as static Java methods.
  @JvmOverloads-instructs the Kotlin compiler to generate overloads for a function that has default parameter values.
  @JvmField-can be applied to a property to expose that property as a public Java field with no getters or setters.

-One of the classic use cases for annotations is customizing object serialization.

-Serialization is a process of converting an object to a binary or text representation that can
 be then stored or sent over the network.

-The reverse process, deserialization, converts such a representation back to an object. One of the most common formats used for
 serialization is JSON.

-domain-specific languages (DSLs).

-Internal DSLs are an API design pattern you can use to build more expressive APIs with structures composed of multiple method calls.

-The benefit of using Kotlin internal DSLs rather than external template or markup languages is the ability to reuse code and create abstractions.

-Using the invoke convention, you can call arbitrary objects as if they were functions.
