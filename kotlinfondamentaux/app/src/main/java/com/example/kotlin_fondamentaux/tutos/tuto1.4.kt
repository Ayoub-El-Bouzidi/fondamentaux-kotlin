package com.example.kotlin_fondamentaux.tutos

fun main() {
    val trickFunction = trick
    trick()
    trickFunction()
}

val trick = {
    println("No treats!")
}
