package com.example.cs5610finalProjectjavaserver.models;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name="tags")
public class Tag {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private Integer sid;
  private String tag;

  public Tag(Integer id, Integer sid, String tag) {
    this.id = id;
    this.sid = sid;
    this.tag = tag;
  }

  public Tag() {
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getSid() {
    return sid;
  }

  public void setSid(Integer sid) {
    this.sid = sid;
  }

  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }
}
