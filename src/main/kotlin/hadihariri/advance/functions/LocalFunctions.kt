package com.rsk.hadihariri.advance.functions

fun foo(fooParam: String) {
    val outerFunction = "outer"
    // Inner local function
    fun bar(barParam: String) {
        // Access outer function parameters
        println(fooParam)
        // Access inner function parameters
        println(barParam)
        // Access variables defined in outer function
        println(outerFunction)
    }
}

fun main(args: Array<String>) {
    foo("Some value")
    // Can't access fun bar() here
}