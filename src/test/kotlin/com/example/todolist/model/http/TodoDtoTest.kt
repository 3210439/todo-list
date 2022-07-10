package com.example.todolist.model.http

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.validation.FieldError
import javax.validation.Validation

class TodoDtoTest {

    val validator = Validation.buildDefaultValidatorFactory().validator

    @Test
    fun todoDtoTest(){
        val todoDto = TodoDto().apply {
            this.title = "TEST"
            this.description = ""
            this.schedule = "2020-10-20 13:0000"
        }

        val result = validator.validate(todoDto)

        result.forEach {
            val field = it as FieldError
            println(it.propertyPath.last().name)
            println(it.message)
            println(it.invalidValue)
        }

        Assertions.assertEquals(true, result.isEmpty())
    }
}