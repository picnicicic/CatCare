package com.example.lastcatcaresystem

data class User(

    var name: String,
    var email: String,
    var uId: String
    ) {
        constructor(): this("", "", "")
    }