package com.sweetspot.api.models;

public class ScorecardTabElement {
  private String type;
  private Object panelType;
  private Boolean preview;
  private String name;
  private String representation;
  private String id;
  
  public ScorecardTabElement() {
    
  }
  
  public ScorecardTabElement(String type, Object panelType, Boolean preview,
      String name, String representation, String id) {
    super();
    this.type = type;
    this.panelType = panelType;
    this.preview = preview;
    this.name = name;
    this.representation = representation;
    this.id = id;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Object getPanelType() {
    return panelType;
  }

  public void setPanelType(Object panelType) {
    this.panelType = panelType;
  }

  public Boolean getPreview() {
    return preview;
  }

  public void setPreview(Boolean preview) {
    this.preview = preview;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getRepresentation() {
    return representation;
  }

  public void setRepresentation(String representation) {
    this.representation = representation;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "ScorecardTabElement [type=" + type + ", panelType=" + panelType
        + ", preview=" + preview + ", name=" + name + ", representation="
        + representation + ", id=" + id + "]";
  } 
}
