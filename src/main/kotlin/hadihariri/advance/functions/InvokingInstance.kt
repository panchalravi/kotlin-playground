package com.rsk.hadihariri.advance.functions

class Req(val method: String, val query: String, val contentType: String)
class Res(var contents: String, var status: Stat) {
    operator fun invoke(status: Stat.() -> Unit) {

    }
}

class Stat(var code: Int, var description: String)
class RtHandler(val req: Req, val res: Res) {
    var executeNext = false
    fun next() {
        this.executeNext = true
    }

}

fun rtHandler(path: String, f: RtHandler.() -> Unit): RtHandler.() -> Unit = f

fun main(args: Array<String>) {
    rtHandler("/index.html") {
        if (req.query != "") {
            //process
        }
        res {
            code = 404
            description = "Not Found"
        }
    }

    val manager = Manager()
    manager("Do Something!")
}

class Manager {
    operator fun invoke(value: String) {
        TODO("Not yet implemented")
    }

}