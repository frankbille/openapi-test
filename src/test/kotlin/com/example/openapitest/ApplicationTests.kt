package com.example.openapitest

import io.restassured.RestAssured
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.web.server.LocalServerPort
import kotlin.properties.Delegates

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT,
        properties = [
            "server.compression.enabled=false",
            "server.port=8080",
        ]
)
abstract class ApplicationTests {

    @set:LocalServerPort
    private var localServerPort: Int by Delegates.notNull()

    @BeforeAll
    fun configureRestAssured() {
        RestAssured.port = localServerPort
    }
}
