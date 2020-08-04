package com.rsk.hadihariri.advance.classes

typealias Name = String
typealias Email = String

data class Employee(val name: Name, val email: Email) {
    fun printName(string: String) {

    }
}

fun main(args: Array<String>) {
    val employee = Employee("Ravi", "ravi@email.com")
    employee.printName("Ravi")
}