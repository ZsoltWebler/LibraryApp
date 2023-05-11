package org.webler.zsolt.libraryapp.controller;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.webler.zsolt.libraryapp.relationships.o2o.User;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User addUser(@RequestBody @Valid User user) {
        return user;
    }

    @GetMapping
    public User getUsers() {
        User user = new User();
        user.setUsername("UserName");
        user.setAge(30);
        user.setEmail("e@mail.com");
        user.setAboutMe("UserName text text text text...");
        user.setWorking(true);

        return user;
    }

}
