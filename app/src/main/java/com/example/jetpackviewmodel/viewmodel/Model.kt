package com.example.jetpackviewmodel

class Person(name: String, email: String, age: Int){
    var name:String = name
    var email:String = email
    var age:Int = age
    fun to_S() : Any? = "$name ($email, $age)"
}