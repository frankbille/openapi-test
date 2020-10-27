package com.example.openapitest

import org.springframework.http.MediaType.APPLICATION_FORM_URLENCODED_VALUE
import org.springframework.http.ResponseEntity
import org.springframework.http.ResponseEntity.ok
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/test")
class FormUrlEncodedController {

    @PostMapping(
            path = ["/formUrlEncoded"],
            consumes = [APPLICATION_FORM_URLENCODED_VALUE]
    )
    fun handleFormUrlEncodedData(@RequestParam("foo") foo: String): ResponseEntity<Any> {
        return ok().build()
    }
}