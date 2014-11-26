package com.sweetspot.api.models;

import java.util.Collection;

public class User {
  private String email;
  private String id;
  private String locale;
  private String name;
  private Collection<Scorecard> scorecards;
  
  public User() {    
    
  }
  
  public User(String email, String id, String locale, String name, Collection<Scorecard> scorecards) {
    super();
    this.email = email;
    this.id = id;
    this.locale = locale;
    this.name = name;
    this.scorecards = scorecards;
  }
  
  public String getEmail() {
    return email;
  }
  
  public void setEmail(String email) {
    this.email = email;
  }
  
  public String getId() {
    return id;
  }
  
  public void setId(String id) {
    this.id = id;
  }
  
  public String getLocale() {
    return locale;
  }
  
  public void setLocale(String locale) {
    this.locale = locale;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public Collection<Scorecard> getScorecards() {
    return scorecards;
  }
  
  public void setScorecards(Collection<Scorecard> scorecards) {
    this.scorecards = scorecards;
  }

  @Override
  public String toString() {
    return "User [email=" + email + ", id=" + id + ", name=" + name + "]";
  }
}
