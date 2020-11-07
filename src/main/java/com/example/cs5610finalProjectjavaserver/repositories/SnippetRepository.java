package com.example.cs5610finalProjectjavaserver.repositories;

import com.example.cs5610finalProjectjavaserver.models.Snippet;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SnippetRepository
        extends CrudRepository<Snippet, Integer> {

  @Query("select snippet from Snippet snippet where creatorId=:creatorId")
  public List<Snippet> findSnippetsforCreator(
          @Param("creatorId") String creatorId);
}
