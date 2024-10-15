package com.example.kotlin_fondamentaux.tutos

//class SmartDevice{
//    val name = "ayoub"
//    val age = 21
//    fun turnOn(){
//        println("hello")
//    }
//    fun turnOf(){
//        println("hi")
//    }
//}
//fun main(){
//    val smart = SmartDevice()
//    println("hello ${smart.name}")
//}
//class Solicode{
//    var name = "Ayoub"
//        get() = field.uppercase()
//        set(value){
//            field = value.trim()
//        }
//}
//fun main(){
//    var solicode = Solicode()
//    println(solicode.name)
//    solicode.name = "bouzidi"
//    println(solicode.name)
//}


//class Person(val name: String, var age: Int) {
//}
//
//fun main(){
//    var person = Person("Ayoub", 21)
//    println("Name: ${person.name} and Age:${person.age}")
//}

//class User(val name: String, val age: Int) {
//    val isAdult: Boolean
//
//    // The init block is executed when an instance of the class is created
//    init {
//        println("User object is being initialized with name = $name and age = $age")
//        isAdult = age >= 18  // Initialize a property based on some logic
//        println("Is $name an adult? $isAdult")
//    }
//}
//
//fun main() {
//    // Creating an instance of the User class
//    val user1 = User("Alice", 25)
//    val user2 = User("Bob", 16)
//}

class SmartDevice(val name: String, val category: String) {
    var deviceStatus = "online" // Default status

    // Secondary constructor
    constructor(name: String, category: String, statusCode: Int) : this(name, category) {
        deviceStatus = when (statusCode) {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }

    // Method to display device details
    fun displayStatus() {
        println("Device Name: $name")
        println("Category: $category")
        println("Status: $deviceStatus")
    }
}

fun main() {
    // Creating an object using the primary constructor
    val device1 = SmartDevice("Smart Light", "Lighting")
    device1.displayStatus()

    // Creating an object using the secondary constructor with statusCode
    val device2 = SmartDevice("Smart Thermostat", "HVAC", 0)
    device2.displayStatus()

    // Creating another object using the secondary constructor with an unknown statusCode
    val device3 = SmartDevice("Smart Doorbell", "Security", 3)
    device3.displayStatus()
}





//
//
//
//class User {
//    var name: String = "John"
//        get() = field.uppercase() // Custom getter
//        set(value) {
//            field = value.trim() // Custom setter
//        }
//}
//
//fun main() {
//    val user = User()
//    println(user.name) // Prints "JOHN"
//    user.name = " Alice "
//    println(user.name) // Prints "ALICE" (value was trimmed)
//}
