package com.zaidathar.flashcardservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class BaseController {

    @GetMapping("/get")
    public ResponseEntity<String> getCall(){
        return ResponseEntity.ok("Success");
    }
}
