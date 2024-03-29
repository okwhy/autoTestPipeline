package com.example.testtest;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class Controller {
    @GetMapping("/api/hello")
    public String ss(){
        return "hello";
    }
    //afaafaf
}
