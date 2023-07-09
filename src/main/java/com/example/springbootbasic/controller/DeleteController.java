package com.example.springbootbasic.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/delete-api")
public class DeleteController {

    @DeleteMapping(value = "/{variable}")
    public String getVariable(@PathVariable String variable) {
        return variable;
    }

    @DeleteMapping(value = "/request")
    public String getRequestParam(@RequestParam String name) {
        return name;
    }
}
