package com.rsk.hadihariri.functional

fun operation(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}

fun operation(x: Int, op: (Int) -> Unit) {
}

fun route(path: String, vararg actions: (String, String) -> String) {}

fun sum(x: Int, y: Int) = x + y

fun unaryOperation(x: Int, op: (Int) -> Int): Int {
    return op(x)
}

fun unaryOp(op: (Int) -> Int) = {}

fun transaction(db: Database, code: () -> Unit) {
    try {
        code()
    } finally {
        db.commit()
    }
}

class Database {
    fun commit() {}
}

fun main(args: Array<String>) {
    val sumLambda: (Int, Int) -> Int = { x, y -> x + y }
    operation(1, 2, ::sum)
    operation(4, 5, sumLambda)
    operation(1, 2) { x, y -> x + y }
    unaryOperation(2) { it * it }
    unaryOp { it * it }

    val db = Database()
    transaction(db) {
        // implementation goes here
    }

    unaryOperation(3, fun(x: Int): Int {
        return x+x
    })
}