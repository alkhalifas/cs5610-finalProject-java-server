package com.example.cs5610finalProjectjavaserver.services;

import com.example.cs5610finalProjectjavaserver.models.Snippet;
import com.example.cs5610finalProjectjavaserver.models.User;
import com.example.cs5610finalProjectjavaserver.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

  public User findUserById(Integer userId) {
    return userRepository.findById(userId).get();
  }

  public User updateUser(
          Integer userId,
          User newUser) {
    Optional userO = userRepository.findById(userId);
    if(userO.isPresent()) {
      User user = (User) userO.get();
      user.setGithubId(newUser.getGithubId());
      user.setFirstName(newUser.getFirstName());
      user.setLastName(newUser.getLastName());
      user.setUsername(newUser.getUsername());
      user.setPassword(newUser.getPassword());
      user.setEmail(newUser.getEmail());
      user.setPaToken(newUser.getPaToken());
      user.setFavorites(newUser.getFavorites());
      user.setUserType(newUser.getUserType());
      return userRepository.save(user);
    } else {
      return null;
    }
  }
}
