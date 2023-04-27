package org.webler.zsolt.libraryapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.webler.zsolt.libraryapp.model.Author;
import org.webler.zsolt.libraryapp.model.Book;
import org.webler.zsolt.libraryapp.service.LibrarianService;

import java.util.ArrayList;
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

        Book book = new Book();
        book.setTitle("ASD");
        book.setAvailable(false);
        book.setIsbn("12313123");
        book.setGenre("fantasy");
        book.setAuthor(new Author(1l,"Name",new ArrayList<Book>()));

        Optional<Book> bookById = service.getBookById(id);
        if (bookById.isPresent()) {
            //return bookById.get();

        }
        return book;
        //throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Book addBook(@RequestBody Book book) {
        service.addBook(book);
        return book;
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book book) {
        return service.updateBookByid(id, book);
    }

    @DeleteMapping("/{id}")
    public void deleteBookById(@PathVariable Long id) {
        service.deleteBookById(id);
    }

}
