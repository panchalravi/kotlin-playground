package com.rsk.hadihariri.advance.delegation

import kotlin.properties.Delegates

typealias Name = String
typealias Email = String

data class Employee(val name: Name, val email: Email) {
    // Lazy
    val lazyValue: String by lazy {
        println("computed!")
        "Hello"
    }

    // Builtin Observable delegate is invoked every time the property is modified
    var department: String by Delegates.observable("") {
        prop, oldValue, newValue -> println("Property ${prop.name} has changed from $oldValue to $newValue")
    }

    fun printName(string: String) {

    }
}

fun main(args: Array<String>) {
    val employee = Employee("Ravi", "ravi@email.com")

    employee.printName("Ravi")
    employee.department = "IT"
}