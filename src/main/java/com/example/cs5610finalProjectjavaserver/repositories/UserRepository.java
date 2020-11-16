package com.example.cs5610finalProjectjavaserver.repositories;

import com.example.cs5610finalProjectjavaserver.models.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository
extends CrudRepository<User, Integer> {
}
