package com.rsk.hadihariri.advance.functions

import java.time.LocalDateTime


fun call(greet: String.(String) -> Unit) {
    //greet("Hello")
    "Hello".greet("Jane")
}

const val ago = "ago"
const val from_now = "from now"
infix fun Int.days(tense: String) {
    when(tense) {
        ago -> println(LocalDateTime.now().minusDays(this.toLong()))
        from_now -> println(LocalDateTime.now().plusDays(this.toLong()))
        else -> println("?")
    }
}

class Meeting(val name: String) {
    val start = this

    infix fun at(time: IntRange) {
        println("$name starts at $time")
    }
}

infix fun String.meeting(block: Meeting.() -> Unit): Unit {
    Meeting(this).block()
}

class Robot {
    val left = "Left"
    val right = "Right"
    val fast = "Fast"

    infix fun turns(direction: String) {
        println("turns $direction")
    }

    infix fun runs(speed: String) {
        println("runs $speed")
    }
}

fun operate(block: Robot.(Robot) -> Unit) {
    println("called...")
    val robot = Robot()
    robot.block(robot)
}

fun main(args: Array<String>) {

    call {
        println("${this.toUpperCase()} $it")
    }

    // 2 days ago
    2 days ago
    2 days from_now
    
    "planning" meeting {
        start at 3..15
    }

    operate {
        it turns left
        it turns right
        it runs fast
    }

}