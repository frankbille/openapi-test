package com.example.openapitest

import io.restassured.module.kotlin.extensions.Given
import io.restassured.module.kotlin.extensions.Then
import io.restassured.module.kotlin.extensions.When
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.http.HttpStatus.OK
import org.springframework.http.MediaType.APPLICATION_FORM_URLENCODED_VALUE


class FormUrlEncodedApplicationTests : ApplicationTests() {

    @Test
    @DisplayName("requests of type application/x-www-form-urlencoded should return OK")
    fun `should return OK`() {
        Given {
            contentType(APPLICATION_FORM_URLENCODED_VALUE)
            formParam("foo", "a".repeat(100))
        } When {
            // uncomment this for extra logging
            // log().all()
            post("/test/formUrlEncoded")
        } Then {
            statusCode(OK.value())
        }
    }
}

