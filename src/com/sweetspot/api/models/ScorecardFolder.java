package com.sweetspot.api.models;

import java.util.Collection;

public class ScorecardFolder {
  
  private Collection<ScorecardItem> scorecardItems;
  private String scorecardFolderPath;
  private String name;
  private int position;
  private String id;
  private Collection<ScorecardFolder> children;
  
  public ScorecardFolder() {
    
  }

  public ScorecardFolder(Collection<ScorecardItem> scorecardItems,
      String scorecardFolderPath, String name, int position, String id,
      Collection<ScorecardFolder> children) {
    super();
    this.scorecardItems = scorecardItems;
    this.scorecardFolderPath = scorecardFolderPath;
    this.name = name;
    this.position = position;
    this.id = id;
    this.children = children;
  }

  public Collection<ScorecardItem> getScorecardItems() {
    return scorecardItems;
  }

  public void setScorecardItems(Collection<ScorecardItem> scorecardItems) {
    this.scorecardItems = scorecardItems;
  }

  public String getScorecardFolderPath() {
    return scorecardFolderPath;
  }

  public void setScorecardFolderPath(String scorecardFolderPath) {
    this.scorecardFolderPath = scorecardFolderPath;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPosition() {
    return position;
  }

  public void setPosition(int position) {
    this.position = position;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Collection<ScorecardFolder> getChildren() {
    return children;
  }

  public void setChildren(Collection<ScorecardFolder> children) {
    this.children = children;
  }
}
