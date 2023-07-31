package com.zaidathar.springvaultconfig.controller;

import com.zaidathar.springvaultconfig.model.Credential;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("")
public class MainController {
    private final Credential credential;

    MainController(Credential credential){
        this.credential = credential;
    }
    @GetMapping("/get-cred")
    public ResponseEntity<String> getMyCred(){
        log.info("Username {}",credential.getUsername());
        log.info("Password {}",credential.getPassword());

        return ResponseEntity.ok("Success");
    }
}
