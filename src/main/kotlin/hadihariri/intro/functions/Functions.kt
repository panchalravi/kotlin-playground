package com.rsk.hadihariri.functions

fun hello(): Unit {
    println("Hello!")
}

fun throwingException(): Nothing {
    throw Exception("This function throws an exception")
}

fun returnAFour(): Int = 4
fun sum(x: Int, y: Int) = x + y
fun greet(name: String, greeting: String = "Hello") = "$greeting, $name"

fun printNames(vararg names: String) {
    reallyPrintNames(*names) // Spread operator
}

fun reallyPrintNames(vararg names: String) {
    for(name in names) {
        println(name)
    }
}

fun main(args: Array<String>) {
    hello()

    val four = returnAFour()
    println(four)

    val total = sum(1,5)
    println(total)

    println(greet("Ravi", "Hi"))

    printNames("Ravi", "Josh", "Mark")
}