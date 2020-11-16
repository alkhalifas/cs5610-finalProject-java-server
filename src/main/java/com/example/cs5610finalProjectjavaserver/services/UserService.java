package com.example.cs5610finalProjectjavaserver.services;

import com.example.cs5610finalProjectjavaserver.models.Snippet;
import com.example.cs5610finalProjectjavaserver.models.User;
import com.example.cs5610finalProjectjavaserver.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

  @Autowired
  UserRepository userRepository;

  public List<User> findAllUsers() {
    return (List<User>) userRepository.findAll();
  }

  public User createUser(User user) {
    return userRepository.save(user);
  }

  public void deleteUser(Integer userId) {
    userRepository.deleteById(userId);
  }

}
