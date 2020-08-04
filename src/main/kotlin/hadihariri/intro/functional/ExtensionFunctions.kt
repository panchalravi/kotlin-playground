package com.rsk.hadihariri.functional

fun String.hello() {
    println("It's me!")
}

fun String.toTitleCase(prefix: String): String {
    return this.split(" ").joinToString(" ") { "$prefix ${it.capitalize()}" }
}


fun main(args: Array<String>) {
    "Hello".hello()
    val toTitleCase = "ravi panchal".toTitleCase("Mr.")
    println(toTitleCase)

}