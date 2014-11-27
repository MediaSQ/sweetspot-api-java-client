package com.sweetspot.api.models;

import com.sweetspot.api.models.utils.MultiColumnImagePaths;

public class ScorecardPanel {
  
  private String id;
  private String name;
  private String panel_type;
  
  private MultiColumnImagePaths weatherIconsPaths;
  private String panelDuration;
  private ScorecardFolder rootFolder;
  
  public ScorecardPanel() {
    
  }

  public ScorecardPanel(String id, String name, String panel_type,
      MultiColumnImagePaths weatherIconsPaths, String panelDuration,
      ScorecardFolder rootFolder) {
    super();
    this.id = id;
    this.name = name;
    this.panel_type = panel_type;
    this.weatherIconsPaths = weatherIconsPaths;
    this.panelDuration = panelDuration;
    this.rootFolder = rootFolder;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPanel_type() {
    return panel_type;
  }

  public void setPanel_type(String panel_type) {
    this.panel_type = panel_type;
  }

  public MultiColumnImagePaths getWeatherIconsPaths() {
    return weatherIconsPaths;
  }

  public void setWeatherIconsPaths(MultiColumnImagePaths weatherIconsPaths) {
    this.weatherIconsPaths = weatherIconsPaths;
  }

  public String getPanelDuration() {
    return panelDuration;
  }

  public void setPanelDuration(String panelDuration) {
    this.panelDuration = panelDuration;
  }

  public ScorecardFolder getRootFolder() {
    return rootFolder;
  }

  public void setRootFolder(ScorecardFolder rootFolder) {
    this.rootFolder = rootFolder;
  }

  @Override
  public String toString() {
    return "ScorecardPanel [id=" + id + ", name=" + name + ", panel_type="
        + panel_type + ", panelDuration=" + panelDuration + "]";
  }
}
