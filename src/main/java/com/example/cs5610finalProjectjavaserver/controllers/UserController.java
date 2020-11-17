package com.example.cs5610finalProjectjavaserver.controllers;

import com.example.cs5610finalProjectjavaserver.models.Favorites;
import com.example.cs5610finalProjectjavaserver.models.User;
import com.example.cs5610finalProjectjavaserver.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

  @Autowired
  UserService service;

  @GetMapping("/api/users")
  public List<User> findAllUsers() {
    return service.findAllUsers();
  }

  @GetMapping("/api/users/{id}")
  public User findUserById(
          @PathVariable("id") Integer userId) {
    return service.findUserById(userId);
  }

  @GetMapping("/api/users/{id}/favorites")
  public List<Favorites> findFavoritesForUser(
          @PathVariable("id") Integer id) {
    return service.findFavoritesForUser(id);
  }

  @DeleteMapping("/api/users/{uid}")
  public void deleteUser(
          @PathVariable("uid") Integer uid) {
    service.deleteUser(uid);
  }

  @PostMapping("/api/users")
  public User createUser(
          @RequestBody User user) {
    return service.createUser(user);
  }

  @PutMapping("/api/users/{uid}")
  public User updateUser(
          @PathVariable("uid") Integer userId,
          @RequestBody User newUser) {
    return service.updateUser(userId, newUser);
  }



}
