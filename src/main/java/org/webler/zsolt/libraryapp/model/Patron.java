package org.webler.zsolt.libraryapp.model;

import java.util.List;

public class Patron {

    Long id;
    private String name;
    private String email;
    private long libraryCardNumber;
    private List<Book> borrowedBooks;

}
