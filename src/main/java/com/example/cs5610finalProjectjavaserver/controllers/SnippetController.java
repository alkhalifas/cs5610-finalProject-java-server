package com.example.cs5610finalProjectjavaserver.controllers;

import com.example.cs5610finalProjectjavaserver.models.Favorites;
import com.example.cs5610finalProjectjavaserver.models.Snippet;
import com.example.cs5610finalProjectjavaserver.models.Tag;
import com.example.cs5610finalProjectjavaserver.services.SnippetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class SnippetController {

  @Autowired
  SnippetService service;

  @GetMapping("/api/creators/{creatorId}/snippets")
  public List<Snippet> findSnippetsforCreator(
          @PathVariable("creatorId") String topicId) {
    return service.findSnippetsforCreator(topicId);
  }

  @GetMapping("/api/snippets")
  public List<Snippet> findAllSnippets() {
    return service.findAllSnippets();
  }

  @GetMapping("/api/snippets/public")
  public List<Snippet> findPublicSnippets() {
    return service.findPublicSnippets(Boolean.TRUE);
  }


  @GetMapping("/api/snippets/{sid}")
  public Snippet findSnippetById(
          @PathVariable("sid") Integer snippetId) {
    return service.findSnippetById(snippetId);
  }

  @GetMapping("/api/snippets/{id}/tags")
  public List<Tag> findTagsForSnippetId(
          @PathVariable("id") Integer id) {
    return service.findTagsForSnippetId(id);
  }

  @GetMapping("/api/snippets/listOfTags")
  public List<Snippet> searchMultipleTags(
          @PathVariable("listOfTags") String listOfTags) {
    List<String> tagsList = Arrays.asList(listOfTags.split("\\s*,\\s*"));
    return service.searchMultipleTags(tagsList);

  }


//  @GetMapping("/api/creators")
//  public List<Snippet> findAllCreators() {
//    return service.findAllCreators();
//  }

  @PostMapping("/api/creators/{creatorId}/snippets")
  public Snippet createSnippet(
          @PathVariable("creatorId") String tid,
          @RequestBody Snippet snippet) {
    snippet.setCreatorId(tid);
    return service.createSnippet(snippet);
  }

  @DeleteMapping("/api/snippets/{sid}")
  public void deleteSnippet(
          @PathVariable("sid") Integer sid) {
    service.deleteSnippet(sid);
  }

  @PutMapping("/api/snippets/{sid}")
  public Snippet updateSnippet(
          @PathVariable("sid") Integer snippetId,
          @RequestBody Snippet newSnippet) {
    return service.updateSnippet(snippetId, newSnippet);
  }
  // TODO: updateSnippet, deleteSnippet
}
