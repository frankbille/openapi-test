package com.example.openapitest

import org.springframework.http.MediaType.APPLICATION_JSON_VALUE
import org.springframework.http.ResponseEntity
import org.springframework.http.ResponseEntity.ok
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/test")
class RestController {

    @PostMapping(
            path = ["/rest"],
            consumes = [APPLICATION_JSON_VALUE]
    )
    fun handleRest(@RequestBody dto: FooDto): ResponseEntity<Any> {
        return ok().build()
    }
}

data class FooDto(
    var foo: String
)
