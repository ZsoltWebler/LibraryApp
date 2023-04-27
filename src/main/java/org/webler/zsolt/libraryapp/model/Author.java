package org.webler.zsolt.libraryapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author {

    Long id;
    private String name;
    @JsonIgnore
    private List<Book> publishedBooks = new ArrayList<>();

}
