package com.rsk.hadihariri.advance.functions

inline fun operation(op: () -> Unit) {
    println("Before calling op()")
    op()
    println("After calling op()")
 }

//Doesn't make sense to inline below function. Check the warning message.
inline fun noOp() {
    println("No op")
}

// This function cannot be inlined as the reference to parameter function is assigned to variable
// Inlining works best for functions with parameters of type function
inline fun tryingToInline(noinline op: () -> Unit) {
    val reference = op
    println("Assigned value")
    op()
}

fun main(args: Array<String>) {
    operation {
        println("This is actual op() function")
    }
}
