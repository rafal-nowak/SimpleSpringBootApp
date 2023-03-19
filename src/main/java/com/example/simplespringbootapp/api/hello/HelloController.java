package com.example.simplespringbootapp.api.hello;

import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/api/v1/hello")
class HelloController {

    final private Environment environment;

    @GetMapping( path = "")
    public ResponseEntity<String> sayHello() {
        final String property = environment.getProperty("aws.dynamoDBUrl");
        String helloString = "Hello, " + "dynamoDBUrl: " + property;
        return ResponseEntity
                .ok(helloString);
    }

}
