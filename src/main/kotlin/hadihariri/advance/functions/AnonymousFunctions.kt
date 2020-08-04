package com.rsk.hadihariri.advance.functions



fun op(x: Int, block: (Int) -> Int) = block(x)


fun main(args: Array<String>) {
    op(3) { it * it }

    // Anonymous function has no name, allows explicit return statement thus allowing multiple
    // return statements based on conditional logic.
    op(3, fun(x): Int { return x * x })
    op(3, fun(x): Int {
        return if (x > 0)
            x * x
        else
            x
    })
}