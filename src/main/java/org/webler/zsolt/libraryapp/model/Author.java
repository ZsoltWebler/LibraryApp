package org.webler.zsolt.libraryapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "authors")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    //3 - 50 char
    //Se null, se üres
    private String name;

    //20 - 255
    //Se null, se üres
    private String description;

    // Valid magyar telefonszám?
    //Se null, se üres
    private String phoneNumber;

    // Valid email cím
    private String email;

    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "wroted_by",
            joinColumns = @JoinColumn(name = "author_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id"))
    private Set<Book> publishedBooks;


}
