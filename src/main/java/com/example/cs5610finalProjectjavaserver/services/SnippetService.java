package com.example.cs5610finalProjectjavaserver.services;

import com.example.cs5610finalProjectjavaserver.models.Snippet;
import com.example.cs5610finalProjectjavaserver.repositories.SnippetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SnippetService {

  @Autowired
  SnippetRepository snippetRepository;

  public List<Snippet> findSnippetsforCreator(String tid) {
    return snippetRepository.findSnippetsforCreator(tid);
  }

  public List<Snippet> findAllSnippets() {
    return (List<Snippet>) snippetRepository.findAll();
  }

  public Snippet findSnippetById(Integer snippetId) {
    return snippetRepository.findById(snippetId).get();
  }

  public Snippet createSnippet(Snippet snippet) {
    return snippetRepository.save(snippet);
  }

  public void deleteSnippet(Integer snippetId) {
    snippetRepository.deleteById(snippetId);
  }
  public Snippet updateSnippet(
          Integer snippetId,
          Snippet newSnippet) {
    Optional snippetO = snippetRepository.findById(snippetId);
    if(snippetO.isPresent()) {
      Snippet snippet = (Snippet) snippetO.get();
      snippet.setTitle(newSnippet.getTitle());
      snippet.setDescription(newSnippet.getDescription());
      return snippetRepository.save(snippet);
    } else {
      return null;
    }
  }
}
