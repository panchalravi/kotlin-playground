package com.rsk.hadihariri.stdlib

import java.util.*

fun main(args: Array<String>) {
    // This is wrong way to initialize list in Kotlin. On the left is Immutable kotlin List whereas on the right
    // is java.util mutable ArrayList.
    // var list: List<String> = ArrayList()

    // Instead, use one of the below to initialize immutable list
    val cities = listOf("London", "Paris")
    val arrayList = Arrays.asList("London", "Paris")
    val emptyList = emptyList<String>()
    // cities.add("Bombay") // Cannot add elements to immutable list

    // create array of numbers
    val numbers = 1..10

    // Mutable list
    val mutableCities = mutableListOf("London", "Paris")
    mutableCities.add("Bombay") // Can add elements to mutable list

    // Create map
    val hashMap = hashMapOf(Pair("India", "Delhi"), Pair("USA", "Washington"))
    // val hashMap = hashMapOf("India" to "Delhi", "USA" to "Washington")
    val booleanArrayOf = booleanArrayOf(false, true, false)
    val charArrayOf = charArrayOf('A', 'B', 'C')


    println(cities.javaClass) //java.util.Arrays$ArrayList
    println(arrayList.javaClass) //java.util.Arrays$ArrayList
    println(emptyList.javaClass) //kotlin.collections.EmptyList
}