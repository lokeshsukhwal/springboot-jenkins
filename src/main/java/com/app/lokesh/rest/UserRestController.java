package com.app.lokesh.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/user")
public class UserRestController {

    @GetMapping("/fetch")
    public ResponseEntity<String> getData(){
        return new ResponseEntity<>("hello from jenkins", HttpStatus.OK);
    }
}
