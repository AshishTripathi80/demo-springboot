package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @GetMapping("/users")
    public List<Map<String, Object>> getUsers() {
        return Collections.singletonList(
                Map.of(
                        "id", 1,
                        "name", "ashish",
                        "email", "a@mail.com",
                        "created_at", "2024-12-12T05:31:45.797Z"
                )
        );
    }
}
