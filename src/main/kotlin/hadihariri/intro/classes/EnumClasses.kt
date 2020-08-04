package com.rsk.hadihariri.classes

enum class Priority(val value: Int) {
    MINOR(-1) {
        override fun text(): String {
            return "[Minor Priority]"
        }

        override fun toString(): String {
            return "Minor Property"
        }
    }, NORMAL(0) {
        override fun text(): String {
            TODO("Not yet implemented")
        }
    }, MAJOR(1) {
        override fun text(): String {
            TODO("Not yet implemented")
        }
    }, CRITICAL(10) {
        override fun text(): String {
            TODO("Not yet implemented")
        }
    };

    abstract fun text(): String
}

fun main(args: Array<String>) {
    val normalPriority = Priority.MINOR
    println("enum.toString(): ${normalPriority.toString()}")
    println("enum.ordinal: ${normalPriority.ordinal}")
    println("enum.value: ${normalPriority.value}")
    println("enum.text(): ${normalPriority.text()}")
    println("enum.name: ${normalPriority.name}")

    /*for(priorityInList in Priority.values()) {
        println(priorityInList)
    }*/

    val p = Priority.valueOf("MAJOR")
    println(p.name)
}