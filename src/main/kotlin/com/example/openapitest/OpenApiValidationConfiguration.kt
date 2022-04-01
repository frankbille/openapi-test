package com.example.openapitest

import com.atlassian.oai.validator.OpenApiInteractionValidator
import com.atlassian.oai.validator.springmvc.OpenApiValidationInterceptor
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer


@Configuration
class OpenApiValidationConfiguration : WebMvcConfigurer {

    override fun addInterceptors(registry: InterceptorRegistry) {
        val validator = OpenApiInteractionValidator
                .createFor("openapi/api.yaml")
                .build()

        registry.run {
            addInterceptor(OpenApiValidationInterceptor(validator))
        }
    }
}
