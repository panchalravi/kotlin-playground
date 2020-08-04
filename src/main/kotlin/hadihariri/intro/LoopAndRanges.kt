package com.rsk.hadihariri.intro

fun main(args: Array<String>) {

    for(a in 1..100) {
        println(a)
    }

    val numbers = 1..100
    for (a in numbers) {}

    for (a in 100 downTo 1) {}

    for(a in 100..1) {}

    for(a in 100 downTo 1 step 5) {}

    val capitals = listOf("London", "Paris", "Rome", "Delhi")
    for(capital in capitals) {
        println(capital)
    }
}