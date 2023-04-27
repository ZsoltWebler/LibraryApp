package org.webler.zsolt.libraryapp.repository;


import org.webler.zsolt.libraryapp.model.Author;

import java.util.List;
import java.util.Optional;

public class AuthorRepository {

    List<Author> authorContainer;
    Long currentId = Long.valueOf(0);

    public AuthorRepository(List<Author> authorContainer) {
        this.authorContainer = authorContainer;
    }

    public boolean addAuthor(Author author) {
        author.setId(currentId);
        currentId = currentId + 1;
        return authorContainer.add(author);
    }

    public Optional<Author> getAuthorById(Long id) {
        return authorContainer.stream().filter(author -> author.getId().equals(id)).findFirst();
    }

    public List<Author> getAuthors() {
        return authorContainer;
    }

    public void deleteAuthor(Author author){
        authorContainer.remove(author);
    }

}
