package org.webler.zsolt.libraryapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.webler.zsolt.libraryapp.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {


}
