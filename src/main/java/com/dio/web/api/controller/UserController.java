package com.dio.web.api.controller;

import com.dio.web.api.model.User;
import com.dio.web.api.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Tag(name = "Plant", description = "the Plant Api")
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository repository;

//    @Operation(
//            summary = "Fetch all plants",
//            description = "fetches all plant entities and their data from data source")
//    @ApiResponses(value = {
//            @ApiResponse(responseCode = "200", description = "successful operation")
//    })
    @GetMapping
    public List<User> getUsers(){
        return repository.findAll();
    }

    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username){
        return repository.findByUsername(username);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void deleteUser(@PathVariable Integer id){
        repository.deleteById(id);
    }

    @PostMapping
    @Transactional
    public void postUser(@RequestBody User user){
        repository.save(user);
    }

}
