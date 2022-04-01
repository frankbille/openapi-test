package com.example.openapitest

import com.atlassian.oai.validator.springmvc.OpenApiValidationFilter
import org.springframework.boot.web.servlet.filter.OrderedFilter
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component

@Component
@Order(OrderedFilter.REQUEST_WRAPPER_FILTER_MAX_ORDER - 3)
class OpenApiValidationFilter : OpenApiValidationFilter(true, true)