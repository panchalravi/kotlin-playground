package com.rsk.hadihariri.advance.classes

interface Repository {
    fun getAll(): List<Customer>
}

class CustomerController() {
    // Initialized the variable later, maybe by IOC
    lateinit var repository: Repository

    fun index(): List<Customer> {
        return repository.getAll()
    }
}

fun main(args: Array<String>) {
    val customerController = CustomerController()
    customerController.index() // will throw exception kotlin.UninitializedPropertyAccessException
}