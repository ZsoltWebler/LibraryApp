package org.webler.zsolt.libraryapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.webler.zsolt.libraryapp.model.Author;
import org.webler.zsolt.libraryapp.model.Book;
import org.webler.zsolt.libraryapp.service.LibrarianService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookController {

}
