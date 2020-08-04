package com.rsk

import java.lang.IllegalArgumentException


class Name(var name: String) {
    init {
        if(this.name.isBlank()) throw IllegalArgumentException()
    }
}