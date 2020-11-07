package com.example.cs5610finalProjectjavaserver.models;

import javax.persistence.*;

@Entity
@Table(name="snippets")
public class Snippet {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String gistId;
  private String creatorId;
  private String dateCreated;
  private String lastModified;
  private String title;
  private String description;
  private String codeText;
  private String tags;
  private String shareableURL;
  private Boolean publicPost;
  private Boolean recommended;


  public Snippet(Integer id, String gistId, String creatorId, String dateCreated, String lastModified, String title, String description, String codeText, String tags, String shareableURL, Boolean publicPost, Boolean recommended) {
    this.id = id;
    this.gistId = gistId;
    this.creatorId = creatorId;
    this.dateCreated = dateCreated;
    this.lastModified = lastModified;
    this.title = title;
    this.description = description;
    this.codeText = codeText;
    this.tags = tags;
    this.shareableURL = shareableURL;
    this.publicPost = publicPost;
    this.recommended = recommended;
  }

  public Snippet() {
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getGistId() {
    return gistId;
  }

  public void setGistId(String gistId) {
    this.gistId = gistId;
  }

  public String getCreatorId() {
    return creatorId;
  }

  public void setCreatorId(String creatorId) {
    this.creatorId = creatorId;
  }

  public String getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(String dateCreated) {
    this.dateCreated = dateCreated;
  }

  public String getLastModified() {
    return lastModified;
  }

  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getCodeText() {
    return codeText;
  }

  public void setCodeText(String codeText) {
    this.codeText = codeText;
  }

  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }

  public String getShareableURL() {
    return shareableURL;
  }

  public void setShareableURL(String shareableURL) {
    this.shareableURL = shareableURL;
  }

  public Boolean getPublicPost() {
    return publicPost;
  }

  public void setPublicPost(Boolean publicPost) {
    this.publicPost = publicPost;
  }

  public Boolean getRecommended() {
    return recommended;
  }

  public void setRecommended(Boolean recommended) {
    this.recommended = recommended;
  }
}
