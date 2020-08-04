package com.rsk.hadihariri.classes

import java.util.*

// kotlin class does not have fields, only properties
class Customer(val id: Int, var name: String, val yearOfBirth: Int) {
    /*var email: String = ""
    init {
        name = name.toUpperCase()
    }

    constructor(id: Int, name: String, email: String): this(id, name) {
        this.email = email
    }*/
    val age: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth

    var socialSecurityNumber: String = ""
        set(value) {
            if (!value.startsWith("SN")) {
                throw IllegalArgumentException("Social security should start with SN")
            }
            field = value
        }

    fun customerAsString() = "Id: $id, Name: $name"

}

fun main(args: Array<String>) {
    val customer = Customer(10, "Ravi", 1978)
    customer.socialSecurityNumber = "SN1234"
    println(customer.age)
    println(customer.socialSecurityNumber)
    println(customer.customerAsString())

}