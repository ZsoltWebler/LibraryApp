package org.webler.zsolt.libraryapp.repository;

import org.springframework.stereotype.Repository;
import org.webler.zsolt.libraryapp.model.Book;

import java.util.List;
import java.util.Optional;

@Repository
public class BookRepository {

    List<Book> bookContainer;
    Long currentId = Long.valueOf(0);

    public BookRepository(List<Book> bookContainer) {
        this.bookContainer = bookContainer;
    }

    public boolean addBook(Book book) {
        book.setId(currentId);
        currentId = currentId + 1;
        return bookContainer.add(book);
    }

    public Optional<Book> getBookById(Long id) {
        return bookContainer.stream().filter(book -> book.getId().equals(id)).findFirst();
    }

    public List<Book> getBooks() {
        return bookContainer;
    }

    public void deleteBook(Book book) {
        bookContainer.remove(book);
    }
}
