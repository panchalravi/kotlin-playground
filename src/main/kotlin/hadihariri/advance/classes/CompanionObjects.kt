package com.rsk.hadihariri.advance.classes

// A class can only have one companion object
// Change constructor to private to prevent instances being created
class Log private constructor(filename: String) {
    companion object Factory {
        @JvmStatic
        fun createFileLog(filename: String): Log = Log(filename)
    }
}

object Singleton {
    var name: String = "Ravi"
    fun printName() {
        println("$name")
    }
}

fun main(args: Array<String>) {
    //Log.Factory.createFileLog("tmp.log") // without companion
    Log.createFileLog("tmp.log") // with companion

    // To access above in Java, use below syntax
    // Log.Factory.createFileLog("")

    // With @JvmStatic, you can access as static method
    // Log.createFileLog("")

    Singleton.printName() // In java, it can be accessed as Singleton.INSTANCE.printName()
}