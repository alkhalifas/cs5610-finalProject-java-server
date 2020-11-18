package com.example.cs5610finalProjectjavaserver.controllers;

import com.example.cs5610finalProjectjavaserver.models.Snippet;
import com.example.cs5610finalProjectjavaserver.models.Tag;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SnippetControllerTest {


  private Snippet s1;
  private Snippet s2;
  private Snippet s3;
  private Tag t1;

  public void setUp() {
    s1 = new Snippet(1, "123", "alkhalifas", "11/17/2020", "11/17/2020", "Some title", "some desc", "some text", "some tags", "some url", Boolean.FALSE, Boolean.FALSE);
    s2 = new Snippet(2, "123", "alkhalifas", "11/17/2020", "11/17/2020", "Some title", "some desc", "some text", "some tags", "some url", Boolean.FALSE, Boolean.FALSE);
    s3 = new Snippet(3, "123", "alkhalifas", "11/17/2020", "11/17/2020", "Some title", "some desc", "some text", "some tags", "some url", Boolean.FALSE, Boolean.FALSE);
  }


  @Test
  void getSnippetNameTest() {
    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+ s1.getGistId());
  }

  @Test
  void searchMultipleTags() {
  }


}
