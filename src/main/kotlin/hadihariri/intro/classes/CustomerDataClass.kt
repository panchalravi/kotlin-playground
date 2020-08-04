package com.rsk.hadihariri.classes

import java.io.IOException

data class CustomerDataClass(var id: Int, var name: String, var email: String) {
    @JvmField
    val someProperty = "Value"

    override fun toString(): String {
        return """
            {"id": "$id", "name": "$name", "email": "$email"}
        """.trimIndent()
    }

    @JvmOverloads
    fun changeStatus(status: Status = Status.CURRENT) {}

    @JvmName("preferential")
    fun makePreferred() {}

    @Throws(IOException::class)
    fun loadStatistics(filename: String) {
        if(filename == "") {
            throw IOException("filename cannot be blank")
        }
    }
}

enum class Status {
    CURRENT,
    NEW
}

fun CustomerDataClass.extension() {}

fun main(args: Array<String>) {
    val customer1 = CustomerDataClass(10, "Ravi", "ravi@email.com")
    val customer2 = CustomerDataClass(20, "Ravi", "ravi@email.com")

    println(customer1 == customer2)
    val customer3 = customer1.copy(id = 30, name = "Ravi Panchal", email = "ravi.panchal@email.com")
    println(customer3)
}