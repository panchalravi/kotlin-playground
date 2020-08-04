package com.rsk.hadihariri.advance.functions

// "return" by default returns to the closest function
// in case of lambda, it returns from the enclosing/containing function, unless you call it with @label
// in case of anonymous function, it returns from the anonymous function

fun containingFunction() {
    val numbers = 1..100
    numbers.forEach myLabel@{
        if(it % 5 == 0) {
            //return - Non-local return is allowed only from within inline function. Returns from containing function.
            //return@forEach - default label is the function name
            return@myLabel // explicit label
        }
    }
    // This will never get printed as "return" statement in above lambda
    // returns from the containing function. Use "return@" to return locally
    // and NOT the containing function.
    println("Hello!")
}

fun main(args: Array<String>) {
    containingFunction();
}