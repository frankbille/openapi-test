
When running the `com.example.openapitest.FormUrlEncodedApplicationTests` tests, log output shows:

```
2020-10-27 11:52:19.883  WARN 85471 --- [nio-8080-exec-1] .w.s.m.s.DefaultHandlerExceptionResolver : 
    Resolved [org.springframework.web.bind.MissingServletRequestParameterException: 
    Required String parameter 'foo' is not present]
```

If you're running in an IDE, you can breakpoint on `MissingServletRequestParameterException` to debug. 