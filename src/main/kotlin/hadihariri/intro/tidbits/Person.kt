package com.rsk.hadihariri.tidbits

open class Person {
}

class Employee: Person() {
    fun vacationDays(days: Int) {
        if ( days < 60) {
            println("You need more vacation")
        }
    }
}

class Contractor: Person() {

}

fun hasVacations(obj: Person) {
    if(obj is Employee) {
        obj.vacationDays(20) // smart cast Person -> Employee
    } else {
        //obj
    }
}

var input:Any = 10

fun main(args: Array<String>) {
    val str = input as? String // safe cast Any -> String
    println(str?.length)
}