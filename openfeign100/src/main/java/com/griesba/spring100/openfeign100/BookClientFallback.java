package com.griesba.spring100.openfeign100;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BookClientFallback implements BookClient{

    private final BookFallbackClient bookFailOverClient;

    @Override
    public String getISBN() {
        return bookFailOverClient.getIsbn();
    }
}
