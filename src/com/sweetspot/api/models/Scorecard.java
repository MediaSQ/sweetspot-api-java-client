package com.sweetspot.api.models;

import java.util.Collection;

public class Scorecard {
  private String name;
  private String path;
  private String id;
  private Personalization personalization;
  private Collection<Scorecard> scorecards;
  private Collection<ScorecardTab> scorecardTabs;
  
  public Scorecard() {
    
  }
  
  public Scorecard(String name, String path, String id, Personalization personalization) {
    super();
    this.name = name;
    this.path = path;
    this.id = id;
    this.personalization = personalization;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getPath() {
    return path;
  }
  
  public void setPath(String path) {
    this.path = path;
  }
  
  public String getId() {
    return id;
  }
  
  public void setId(String id) {
    this.id = id;
  }
  
  public Personalization getPersonalization() {
    return personalization;
  }
  
  public void setPersonalization(Personalization personalization) {
    this.personalization = personalization;
  }

  public Collection<Scorecard> getScorecards() {
    return scorecards;
  }

  public void setScorecards(Collection<Scorecard> scorecards) {
    this.scorecards = scorecards;
  }

  public Collection<ScorecardTab> getScorecardTabs() {
    return scorecardTabs;
  }

  public void setScorecardTabs(Collection<ScorecardTab> scorecardTabs) {
    this.scorecardTabs = scorecardTabs;
  }

  @Override
  public String toString() {
    return "Scorecard [name=" + name + ", path=" + path + ", id=" + id + "]";
  }
}
