
When running the `com.example.openapitest.RestApplicationTests` tests, log output shows:

```
2022-04-01 14:43:40.601 ERROR 17386 --- [nio-8080-exec-1] c.a.o.v.s.DefaultValidationReportHandler : OpenAPI location=REQUEST key=POST#/test/rest levels=ERROR messages=Validation failed.
[ERROR][REQUEST][POST /test/rest @body] A request body is required but none found.
```

The test passes if you remove `HttpRequestLoggingFilter` by commenting out

```
@Component
@Order(OrderedFilter.REQUEST_WRAPPER_FILTER_MAX_ORDER - 2)
```

in `com.example.openapitest.HttpRequestLoggingFilter`



 