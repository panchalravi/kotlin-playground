package com.rsk.hadihariri.intro

fun main(args: Array<String>) {

    val myString = "Not Empty"
    val result = if (myString != "") {
        "Not empty"
    } else {
        "Is empty"
    }

    when(result) {
        is String -> println("Excellent")
        "Value" -> println("Value")
    }

    val whenValue = when(result) {
        is String -> "Is a string"
        "Value" -> "Has a value"
        else -> "It came to this?"
    }
    println(whenValue)
}