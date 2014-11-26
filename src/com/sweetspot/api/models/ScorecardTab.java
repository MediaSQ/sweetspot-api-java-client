package com.sweetspot.api.models;

import java.util.Collection;

public class ScorecardTab {
  private String clientId;
  private Boolean scorecardTabbed;
  private Integer position;
  private Boolean showWeatherList;
  private Boolean beingPopulated;
  private Boolean scorecardEditable;
  private Personalization personalization;
  private String logoUrl;
  private Boolean editableContent;
  private String name;
  private String id;
  private Collection<ScorecardTabElement> scorecardTabElements;
  
  public ScorecardTab() {
    
  }
  
  public ScorecardTab(String clientId, Boolean scorecardTabbed,
      Integer position, Boolean showWeatherList, Boolean beingPopulated,
      Boolean scorecardEditable, Personalization personalization,
      String logoUrl, Boolean editableContent, String name, String id,
      Collection<ScorecardTabElement> scorecardTabElements) {
    super();
    this.clientId = clientId;
    this.scorecardTabbed = scorecardTabbed;
    this.position = position;
    this.showWeatherList = showWeatherList;
    this.beingPopulated = beingPopulated;
    this.scorecardEditable = scorecardEditable;
    this.personalization = personalization;
    this.logoUrl = logoUrl;
    this.editableContent = editableContent;
    this.name = name;
    this.id = id;
    this.scorecardTabElements = scorecardTabElements;
  }

  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public Boolean getScorecardTabbed() {
    return scorecardTabbed;
  }

  public void setScorecardTabbed(Boolean scorecardTabbed) {
    this.scorecardTabbed = scorecardTabbed;
  }

  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  public Boolean getShowWeatherList() {
    return showWeatherList;
  }

  public void setShowWeatherList(Boolean showWeatherList) {
    this.showWeatherList = showWeatherList;
  }

  public Boolean getBeingPopulated() {
    return beingPopulated;
  }

  public void setBeingPopulated(Boolean beingPopulated) {
    this.beingPopulated = beingPopulated;
  }

  public Boolean getScorecardEditable() {
    return scorecardEditable;
  }

  public void setScorecardEditable(Boolean scorecardEditable) {
    this.scorecardEditable = scorecardEditable;
  }

  public Personalization getPersonalization() {
    return personalization;
  }

  public void setPersonalization(Personalization personalization) {
    this.personalization = personalization;
  }

  public String getLogoUrl() {
    return logoUrl;
  }

  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }

  public Boolean getEditableContent() {
    return editableContent;
  }

  public void setEditableContent(Boolean editableContent) {
    this.editableContent = editableContent;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Collection<ScorecardTabElement> getScorecardTabElements() {
    return scorecardTabElements;
  }

  public void setScorecardTabElements(Collection<ScorecardTabElement> scorecardTabElements) {
    this.scorecardTabElements = scorecardTabElements;
  }  
}
