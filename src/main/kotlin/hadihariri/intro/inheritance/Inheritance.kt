package com.rsk.hadihariri.inheritance

open class Person {
    open fun validate() {}
}

open class Customer : Person() {
    final override fun validate() {
    }
}

class SpecialCustomer: Customer() {
}

fun main(args: Array<String>) {
    val customer = Customer()
    customer.validate()

}