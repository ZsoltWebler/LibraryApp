package org.webler.zsolt.libraryapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author {

    Long id;
    private String name;
    //private List<Book> publishedBooks;

}
