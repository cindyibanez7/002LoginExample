package com.example.a002loginexample.API
import java.util.*

class AppAPI {
    fun validateUser(username: String, password: String): String? {
        return if (password == "admin" && username == "admin"){
            UUID.randomUUID().toString()
        } else {
            null

        }
    }
}