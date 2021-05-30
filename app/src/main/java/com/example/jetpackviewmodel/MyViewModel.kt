package com.example.jetpackviewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel

class MyViewModel(app: Application) : AndroidViewModel(app) {
    private val data: MutableList<Person> = mutableListOf(
        Person("Taro", "taro@yamada.com", 35),
        Person("Hanako", "hanako@sato.com", 20),
        Person("Takeo", "takeo@sumi.com", 43)
    )

    fun getAll() : List<Person> = data
    fun getById(id: Int) : Person = data[id]
    fun add(name: String, mail: String, age: Int){
        data.add(Person(name, mail, age))
    }
}