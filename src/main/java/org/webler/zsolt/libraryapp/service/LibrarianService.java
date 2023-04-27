package org.webler.zsolt.libraryapp.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import org.webler.zsolt.libraryapp.model.Author;
import org.webler.zsolt.libraryapp.model.Book;
import org.webler.zsolt.libraryapp.repository.AuthorRepository;
import org.webler.zsolt.libraryapp.repository.BookRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LibrarianService {

    AuthorRepository authorRepository;
    BookRepository bookRepository;

    public LibrarianService() {
        this.authorRepository = new AuthorRepository(new ArrayList<>());
        this.bookRepository = new BookRepository(new ArrayList<>());
    }

    public boolean addBook(Book book) {
        Author author = book.getAuthor();
        if (author != null) {

            if (author.getId() != null && author.getName() != null) {


                if (authorRepository.getAuthorById(author.getId()).isPresent()) {


                } else {
                    throw new ResponseStatusException(HttpStatus.NOT_FOUND);
                }

            } else {
                Author newAuthor = new Author();
                newAuthor.setName(author.getName());
                authorRepository.addAuthor(newAuthor);
                book.setAuthor(newAuthor);

            }

        }

        return bookRepository.addBook(book);
    }

    public boolean addAuthor(Author author) {
        return authorRepository.addAuthor(author);
    }

    public List<Book> getBooks() {
        return bookRepository.getBooks();
    }

    public List<Author> getAuthors() {
        return authorRepository.getAuthors();
    }

    public Optional<Book> getBookById(Long id) {
        return bookRepository.getBookById(id);
    }

    public Optional<Author> getAuthorById(Long id) {
        return authorRepository.getAuthorById(id);
    }

    public void deleteAuthorById(Long id) {
        Author author = authorRepository.getAuthorById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        authorRepository.deleteAuthor(author);
    }
}
