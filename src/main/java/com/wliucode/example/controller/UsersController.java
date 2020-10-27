package com.wliucode.example.controller;

import com.wliucode.example.model.Users;
import com.wliucode.example.respository.UserJpaRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("users")
public class UsersController {

    @Autowired
    private UserJpaRepository userJpaRepository;

    // Old approach
    // @RequestMapping(value = "/all", method = RequestMethod.GET)
    @GetMapping(value = "/all")  // new approach spring provided
    public List<Users> findAll(){
        return userJpaRepository.findAll();
    }

    @GetMapping(value = "/{name}")
    public Users findByName(@PathVariable final String name){
        return userJpaRepository.findByName(name);
    }

    @PostMapping(value = "/load")
    public Users load(@RequestBody final Users users){
        userJpaRepository.save(users);

        return userJpaRepository.findByName(users.getName());


    }
}
