package com.sweetspot.api.models;

import com.sweetspot.api.models.utils.MultiColumnImagePaths;

public class ScorecardPanel {
  private MultiColumnImagePaths weatherIconsPaths;
  private String panelDuration;
  private ScorecardFolder rootFolder;
  
  public ScorecardPanel() {
    
  }
  
  public ScorecardPanel(MultiColumnImagePaths weatherIconsPaths,
      String panelDuration, ScorecardFolder rootFolder) {
    super();
    this.weatherIconsPaths = weatherIconsPaths;
    this.panelDuration = panelDuration;
    this.rootFolder = rootFolder;
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
}
