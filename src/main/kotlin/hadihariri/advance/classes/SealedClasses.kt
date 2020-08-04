package com.rsk.hadihariri.advance.classes

// Sealed class is an extension of Enum
// Each Enum constant is restricted to single instance
// Subclass of a sealed class can have multiple instances which can contain state

sealed class PageResult()
data class Success(val content: String): PageResult() {}
data class Error(val code: Int, val message: String): PageResult() {}

fun getURLPage(url: String): PageResult {
    val wasValidCall = false

    return if (wasValidCall)
        Success("The content")
    else
        Error(404, "Not Found")
}

fun main(args: Array<String>) {
    val pageResult = getURLPage("/")

    when(pageResult) {
        is Success -> println(pageResult.content)
        is Error -> println(pageResult.message)
    }
}