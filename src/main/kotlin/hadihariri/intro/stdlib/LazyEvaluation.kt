package com.rsk.hadihariri.stdlib

import java.time.Duration
import java.time.LocalTime
import java.time.temporal.ChronoUnit
import java.time.temporal.TemporalUnit

fun main(args: Array<String>) {
    val elements = 1..1_000_000_000_0
    val beginTime = Duration.ofMillis(System.currentTimeMillis())

    // This will evaluate eagerly every single element in the list, printing in the end (takes around 10 seconds)
    // elements.filter { it < 30 }.map { Pair("Yes", it) }.forEach { println(it) }

    // Instead, use lazy evaluation, starts printing as soon as there is an element meeting the conditions
    // still takes 10 seconds as it scans through the list
    // elements.asSequence().filter { it < 30 }.map { "Yes" to it }.forEach { println(it) }

    // Below takes first 30 elements and stop processing the rest of the sequence, completes in around 20 ms.
    val sum = elements.asSequence().take(30).sum()
    println(sum)

    val endTime = Duration.ofMillis(System.currentTimeMillis())
    println("Total time ${endTime.minus(beginTime).toMillis()}")

    val numbers = generateSequence(1) { x -> x + 10 }
    val sum1 = numbers.take(30).sum()
    println(sum1)

    // lazy init, only initialized when invoked by caller
    val lazyInit: Int by lazy { 10 }
}