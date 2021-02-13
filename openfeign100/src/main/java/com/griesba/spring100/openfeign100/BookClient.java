package com.griesba.spring100.openfeign100;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "books-service")
public interface BookClient {
    @GetMapping(value = "/isbn")
    String getISBN();
}
