package org.webler.zsolt.libraryapp.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    Long id;
    private String isbn;
    private String title;
    private Author author;
    private String genre;
    private boolean available;

}
