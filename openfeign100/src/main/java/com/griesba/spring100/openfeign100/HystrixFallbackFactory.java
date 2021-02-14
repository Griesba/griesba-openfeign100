package com.griesba.spring100.openfeign100;

import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

//@Component
public class HystrixFallbackFactory implements FallbackFactory<BookClient> {
    @Override
    public BookClient create(Throwable cause) {
        return new BookClient() {
            @Override
            public String getISBN() {
                return "error getting isbn";
            }
        };
    }
}
