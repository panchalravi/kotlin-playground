package com.rsk.hadihariri.stdlib

import java.io.File

fun main(args: Array<String>) {
    // String extension function
    "Mr. Ravi Panchal".startsWith("Mr.", false)

    val file = File("filename.txt")
    with(file) {
        // access all properties and methods of File object here
        // isAbsolute etc.
    }

    if(file.isAbsolute) {
        // logic goes here
        // and here ...
    }

    val string: String? = "Some value"
    string?.let {
        it.toUpperCase()
    }

    "Let's use apply".apply {
        this.toUpperCase()
    }

    transactional {
        // PreparedStatement - Insert
    }
}

fun transactional(block:() -> Unit) {
    // Start transaction
    // tx.begin()
    try {
        block()
        //tx.commit()
    } catch (e: Exception) {
        //tx.rollback()
        //log error
    }
    finally {
        //tx.close()
        //release resources
    }
}