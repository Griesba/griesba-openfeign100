package com.griesba.spring.openfeing100failover;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @GetMapping(value = "/isbn-failover")
    public String getIsbn() {
        return "XXXXXX";
    }
}
