package com.rsk.hadihariri.intro

fun main(args: Array<String>) {
    var streetNumber = 10
    var streetName = "High Street"
    val zip = "E11 P1"

    val myLong = 10L
    val myFloat = 100F
    val myHex = 0x0F
    val myBinary = 0xb01

    val myInt = 100
    val myLongAgain: Long = myInt.toLong() // no implicit casting in kotlin

    // String
    val myChar = 'A'
    val myString = "My String"
    val escapeCharacters = "A new line \n"
    val rawString = """
        Hello!
        This is second line.
        A third line.
    """.trimIndent()

    val years = 10
    val message = "A  decade is $years years"

    val name = "Mary"
    val anotherMessage = "Length of name is ${name.length}"


}