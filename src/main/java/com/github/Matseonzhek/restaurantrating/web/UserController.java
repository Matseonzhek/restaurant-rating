package com.github.Matseonzhek.restaurantrating.web;

import com.github.Matseonzhek.restaurantrating.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @Autowired
    private final UserRepository userRepository;


    protected UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
