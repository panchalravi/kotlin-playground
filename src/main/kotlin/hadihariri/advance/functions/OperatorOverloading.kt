package com.rsk.hadihariri.advance.functions

import java.lang.StringBuilder

data class Time(val hours: Int, val minutes: Int) {
    operator fun plus(time: Time): Time {
        val minutes = this.minutes + time.minutes
        val hoursInMinutes = minutes / 60
        val remainingMinutes = minutes % 60
        val hours = this.hours + time.hours + hoursInMinutes
        return Time(hours, remainingMinutes)
    }
}

operator fun  StringBuilder.plus(stringBuilder: StringBuilder) {
    stringBuilder.forEach { this.append(it) }
}

fun main(args: Array<String>) {
    val newTime = Time(10, 10) + Time(3,20)
    println(newTime)

    val sb = StringBuilder()
    for(str in sb) {
        str + "Value"
    }
}