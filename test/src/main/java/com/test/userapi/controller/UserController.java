package com.test.userapi.controller;

import com.test.userapi.domain.User;
import com.test.userapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/")
    public ResponseEntity<List<User>> finalAll(){
        List<User> userList = userRepository.findAll();
        return userList != null ? ResponseEntity.ok(userList) : ResponseEntity.notFound().build();
    }

    @GetMapping("/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable long id){
        User user = userRepository.findById(id);
        return user != null ? ResponseEntity.ok(user) : ResponseEntity.notFound().build();
    }

    @PostMapping("/")
    public User createUser(@RequestBody User user){
        return userRepository.save(user);
    }

    @PutMapping("/{userId}")
    public User updateUserById(@PathVariable long id){
        return userRepository.update(id);
    }


    @DeleteMapping("/{userId}")
    public void deleteById(@PathVariable long id){
        userRepository.delete(id);
    }

}
