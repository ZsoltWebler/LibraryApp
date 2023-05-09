package org.webler.zsolt.libraryapp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.webler.zsolt.libraryapp.model.Author;


@Repository
public interface AuthorRepository extends JpaRepository<Author,Long> {



}
