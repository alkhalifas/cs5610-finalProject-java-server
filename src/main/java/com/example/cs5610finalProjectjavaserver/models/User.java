package com.example.cs5610finalProjectjavaserver.models;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String githubId;
  private String firstName;
  private String lastName;
  private String username;
  private String password;
  private String email;
  private String paToken;
  private String favorites;
  private String userType;


  public User(Integer id, String githubId, String firstName, String lastName, String username, String password, String email, String paToken, String favorites, String userType) {
    this.id = id;
    this.githubId = githubId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.username = username;
    this.password = password;
    this.email = email;
    this.paToken = paToken;
    this.favorites = favorites;
    this.userType = userType;
  }

  public User() {
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getGithubId() {
    return githubId;
  }

  public void setGithubId(String githubId) {
    this.githubId = githubId;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPaToken() {
    return paToken;
  }

  public void setPaToken(String paToken) {
    this.paToken = paToken;
  }

  public String getFavorites() {
    return favorites;
  }

  public void setFavorites(String favorites) {
    this.favorites = favorites;
  }

  public String getUserType() {
    return userType;
  }

  public void setUserType(String userType) {
    this.userType = userType;
  }
}
