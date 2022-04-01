package com.example.openapitest

import io.restassured.module.kotlin.extensions.Given
import io.restassured.module.kotlin.extensions.Then
import io.restassured.module.kotlin.extensions.When
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.http.HttpStatus.OK
import org.springframework.http.MediaType.APPLICATION_JSON_VALUE


class RestApplicationTests : ApplicationTests() {

    @Test
    @DisplayName("requests of type application/json should return OK")
    fun `should return OK`() {
        Given {
            contentType(APPLICATION_JSON_VALUE)
            body(FooDto(foo = "Test"))
        } When {
            // uncomment this for extra logging
            // log().all()
            post("/test/rest")
        } Then {
            statusCode(OK.value())
        }
    }
}

