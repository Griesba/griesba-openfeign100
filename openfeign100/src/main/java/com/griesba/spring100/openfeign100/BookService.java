package com.griesba.spring100.openfeign100;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookClient bookClient;

    public String getBookISBN() {
        return bookClient.getISBN();
    }

}
