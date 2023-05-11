package org.webler.zsolt.libraryapp.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    Long id;

    // Valid ISBN?
    //Se null, se üres
    private String isbn;

    // 5-30 char között
    //Se null, se üres
    private String title;

    //20 - 255
    //Se null, se üres
    private String description;

    // Pozitív vagy nulla
    private int pageCount;

    @NotBlank
    private String genre;

    // Csak igaz lehet
    private boolean available;

    @JsonIgnore
    @ManyToMany(mappedBy = "publishedBooks")
    private Set<Author> author;


}
