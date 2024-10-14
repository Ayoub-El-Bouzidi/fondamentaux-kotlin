package com.example.kotlin_fondamentaux.tutos


//fun main() {
//    val trafficLightColor = "Black"
//
//    if (trafficLightColor == "Red") {
//        println("Stop")
//    } else if (trafficLightColor == "Yellow") {
//        println("Slow")
//    } else if (trafficLightColor == "Green") {
//        println("Go")
//    } else {
//        println("Invalid traffic-light color")
//    }
//
//}

fun main() {
    val trafficLightColor = "Amber"

    when (trafficLightColor) {
        "Red" -> println("Stop")
        "Yellow", "Amber" -> println("Slow")
        "Green" -> println("Go")
        else -> println("Invalid traffic-light color")
    }
}
