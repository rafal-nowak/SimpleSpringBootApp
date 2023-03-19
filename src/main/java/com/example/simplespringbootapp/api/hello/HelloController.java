package com.example.simplespringbootapp.api.hello;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/api/v1/hello")
class HelloController {

    @GetMapping( path = "")
    public ResponseEntity<String> sayHello() {
        String helloString = "Hello";
        return ResponseEntity
                .ok(helloString);
    }

}
