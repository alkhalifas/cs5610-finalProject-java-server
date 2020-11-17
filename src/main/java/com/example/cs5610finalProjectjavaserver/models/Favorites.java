package com.example.cs5610finalProjectjavaserver.models;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name="favorites")
public class Favorites {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private Integer uid;
  private String favorite;

  public Favorites(Integer id, Integer uid, String favorite) {
    this.id = id;
    this.uid = uid;
    this.favorite = favorite;
  }

  public Favorites() {
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getUid() {
    return uid;
  }

  public void setUid(Integer uid) {
    this.uid = uid;
  }

  public String getFavorite() {
    return favorite;
  }

  public void setFavorite(String favorite) {
    this.favorite = favorite;
  }
}
