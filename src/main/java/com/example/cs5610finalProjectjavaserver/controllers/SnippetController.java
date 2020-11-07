package com.example.cs5610finalProjectjavaserver.controllers;

import com.example.cs5610finalProjectjavaserver.models.Snippet;
import com.example.cs5610finalProjectjavaserver.services.WidgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class SnippetController {

  @Autowired
  WidgetService service;// = new WidgetService();

  @GetMapping("/api/creators/{creatorId}/snippets")
  public List<Snippet> findSnippetsforCreator(
          @PathVariable("creatorId") String topicId) {
    return service.findSnippetsforCreator(topicId);
  }

  @GetMapping("/api/snippets")
  public List<Snippet> findAllSnippets() {
    return service.findAllSnippets();
  }
  @GetMapping("/api/snippets/{sid}")
  public Snippet findSnippetById(
          @PathVariable("sid") Integer widgetId) {
    return service.findSnippetById(widgetId);
  }
  @PostMapping("/api/creators/{creatorId}/snippets")
  public Snippet createSnippet(
          @PathVariable("creatorId") String tid,
          @RequestBody Snippet widget) {
    widget.setCreatorId(tid);
    return service.createSnippet(widget);
  }
  @DeleteMapping("/api/snippets/{sid}")
  public void deleteSnippet(
          @PathVariable("sid") Integer sid) {
    service.deleteSnippet(sid);
  }
  @PutMapping("/api/snippets/{sid}")
  public Snippet updateSnippet(
          @PathVariable("sid") Integer widgetId,
          @RequestBody Snippet newWidget) {
    return service.updateSnippet(widgetId, newWidget);
  }
  // TODO: updateSnippet, deleteSnippet
}
