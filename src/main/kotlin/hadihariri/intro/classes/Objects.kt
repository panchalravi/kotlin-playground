package com.rsk.hadihariri.classes

object Global {
    const val PI = 3.14
}

fun main(args: Array<String>) {
    val localObject = object {
        val PI = 3.14
    }
    println(localObject.PI)
}