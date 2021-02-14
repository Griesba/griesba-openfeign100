package com.griesba.spring100.openfeign100;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "book-failover")
public interface BookFallbackClient {
    @GetMapping(value = "/isbn-failover")
    String getIsbn();
}
