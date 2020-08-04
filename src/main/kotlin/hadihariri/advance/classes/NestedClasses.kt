package com.rsk.hadihariri.advance.classes

class DirectoryExplorer(val user: String) {

    fun listFolder(folder: String) {
        val permissionCheck = PermissionCheck()
        permissionCheck.validatePermission()
    }

    inner class PermissionCheck {
        fun validatePermission() {
            // only "inner" classes can access member variables of outer class
            if(user != "ravi") {}
        }
    }
}


fun main(args: Array<String>) {
    val de = DirectoryExplorer("ravi")
    //val deInner = DirectoryExplorer("ravi").PermissionCheck()
}