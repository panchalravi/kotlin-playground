package com.rsk.hadihariri.advance.functions

// infix can be applied only to extension or member functions with single parameter
infix fun String.shouldBeEqualTo(value: String) = this == value

fun main(args: Array<String>) {
    "Hello".shouldBeEqualTo("Hello")

    val output = "Hello"
    output shouldBeEqualTo "Hello"
}