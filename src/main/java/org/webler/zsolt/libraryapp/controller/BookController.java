package org.webler.zsolt.libraryapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.webler.zsolt.libraryapp.model.Book;
import org.webler.zsolt.libraryapp.service.LibrarianService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    LibrarianService service;

    @GetMapping
    public List<Book> getBook() {
        return service.getBooks();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        Optional<Book> bookById = service.getBookById(id);
        if (bookById.isPresent()) {
            return bookById.get();
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Book addBook(@RequestBody Book book) {
        service.addBook(book);
        return book;
    }

}
