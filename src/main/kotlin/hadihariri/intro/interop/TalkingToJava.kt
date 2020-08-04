package com.rsk.hadihariri.interop

import hadihariri.intro.classes.CustomerJava
import hadihariri.intro.interop.CustomerRepository
import hadihariri.intro.interop.PersonJava

fun main(args: Array<String>) {
    val customer = CustomerJava()
    customer.id = 10
    customer.name = "Ravi" // Getter and Setter in Java are accessed using properties in Kotlin
    customer.email = "ravi@email.com"

    customer.prettyPrint()

    val kr = CustomerRepoKotlin()
}


class CustomerRepoKotlin: CustomerRepository {
    override fun getById(id: Int?): CustomerJava {
        TODO("Not yet implemented")
    }

    override fun getAll(): MutableList<CustomerJava> {
        TODO("Not yet implemented")
    }

}
class PersonKotlin: PersonJava() {}