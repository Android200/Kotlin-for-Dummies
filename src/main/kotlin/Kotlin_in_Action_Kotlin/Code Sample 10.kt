package Kotlin_in_Action_Kotlin

import java.lang.IllegalArgumentException

fun main(){

    //Option 1 local functions
    saveUser(User(1, "", ""))
    //Option 2 local functions
    saveUsers(User(2, "1", "1"))


}

//local functions
class User(val id: Int, val name: String, val address: String)

//Options 1
fun saveUser(user: User){
    if(user.name.isEmpty()){
        throw IllegalArgumentException(
            "Can't save user ${user.id}: empty Name"
        )
    }

    if(user.address.isEmpty()){
        throw IllegalArgumentException(
            "Can't save user ${user.id}: empty Kotlin_in_Action_Photo.Address"
        )
    }
}

//Options 2
fun saveUsers(user: User){
    fun validate(value: String, fieldName: String){
        if(value.isEmpty()){
            throw IllegalArgumentException(
                "Can't save user ${user.id} "+"empty $fieldName"
            )
        }

    }
    validate(user.name, "Name")
    validate(user.address, "Kotlin_in_Action_Photo.Address")
}
