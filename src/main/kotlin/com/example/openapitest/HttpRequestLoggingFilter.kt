package com.example.openapitest

import org.springframework.boot.web.servlet.filter.OrderedFilter
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component
import org.springframework.web.filter.OncePerRequestFilter
import org.springframework.web.util.ContentCachingRequestWrapper
import javax.servlet.FilterChain
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@Component
@Order(OrderedFilter.REQUEST_WRAPPER_FILTER_MAX_ORDER - 2)
class HttpRequestLoggingFilter : OncePerRequestFilter() {

    override fun doFilterInternal(
        uncachedRequest: HttpServletRequest,
        uncachedResponse: HttpServletResponse,
        filterChain: FilterChain
    ) = filterChain.doFilter(ContentCachingRequestWrapper(uncachedRequest), uncachedResponse)
}