package com.example.todolist.database

data class TodoDataBase(
    var index: Int=0,
    var todoList: MutableList<Todo> = mutableListOf()
) {

    fun init(){
        this.todoList = mutableListOf()
        println("[DEBUG] todo database init")
    }

}