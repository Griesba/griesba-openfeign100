package com.griesba.spring100.openfeing100.openfeign100server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class BookController {


    @GetMapping(value = "isbn")
    public String getIsbn(){
        return "123456XXX";
    }
}
