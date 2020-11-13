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

  @Query("select snippet from Snippet snippet where publicPost=:publicPost")
  public List<Snippet> findPublicSnippets(
          @Param("publicPost") Boolean publicPost);

//  @Query("select creatorId from Snippet group by creatorId")
//  public List<Snippet> findAllCreators();


//  @Query("select creatorId from Snippet where tags like '*searchPhrase*'")
//  public List<Snippet> searchSingleWord(
//          @Param("searchPhrase") String creatorId);
//
}


//order by creator
