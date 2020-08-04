package com.rsk.hadihariri.advance.delegation

import com.rsk.hadihariri.advance.classes.Customer

interface Repository {
    fun getById(id: Int): Customer
    fun getAll(): List<Customer>
}

interface Logger {
    fun log()
}

// Delegation actually implements interfaces and also has those interfaces as member fields
// Within implemented methods, it delegates to member fields by invoking methods.
class Controller(repository: Repository, logger: Logger): Repository by repository, Logger by logger  {
    fun index(): Unit {
        getAll()
        log()
    }
}

fun main(args: Array<String>) {

}

