package com.example.todolist.database

data class TodoDataBase(
    var index: Int=0,
    var todoList: MutableList<Todo> = mutableListOf()
) {

    fun init(){
        this.todoList = mutableListOf()
        this.index = 0
        println("[DEBUG] todo database init")
    }

}