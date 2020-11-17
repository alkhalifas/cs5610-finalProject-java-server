package com.example.cs5610finalProjectjavaserver.repositories;

import com.example.cs5610finalProjectjavaserver.models.Favorites;
import com.example.cs5610finalProjectjavaserver.models.User;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository
extends CrudRepository<User, Integer> {

  @Query("select favorite from Favorites favorite where uid=:id")
  public List<Favorites> findFavoritesForUser(
          @Param("id") Integer id);
}
