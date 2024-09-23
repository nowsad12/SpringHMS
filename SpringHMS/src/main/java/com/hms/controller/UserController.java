package com.hms.controller;

import com.hms.model.User;
import com.hms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired //(required=true)
    private UserService userService;

    @PostMapping("/users")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping("/users")
    public List<User> fetchUserList() {
        return userService.fetchUserList();
    }

    @GetMapping("/users/{id}")
    public User fetchUserById(@PathVariable("id") int userId) {
        return userService.fetchUserById(userId);
    }

    @DeleteMapping("/users/{id}")
    public String deleteUserById(@PathVariable("id") int userId) {
        userService.deleteUserById(userId);
        return "User Deleted Done";
    }
    PutMapping("/users/{id}")
    public User updateUser(@PathVariable("id") Long userId,@RequestBody User user) {
        return userService.updateUser(userId,user);

    }
}


//    public String saveUser(@RequestBody String sr){
//        return sr;
//    }
