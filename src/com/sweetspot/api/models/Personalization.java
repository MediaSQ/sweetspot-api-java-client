package com.sweetspot.api.models;

import java.util.Hashtable;

public class Personalization {
  private Hashtable<String, String> allColors;
  private String backgroundImage;
  private String logoPath;
  private String slideMasterId;
  
  public Personalization() {
    
  }
  
  public Personalization(Hashtable<String, String> allColors, String logoPath, String slideMasterId) {
    super();
    this.allColors = allColors;
    this.logoPath = logoPath;
    this.slideMasterId = slideMasterId;
  }
  
  public Hashtable<String, String> getAllColors() {
    return allColors;
  }
  
  public void setAllColors(Hashtable<String, String> allColors) {
    this.allColors = allColors;
  }
  
  public String getLogoPath() {
    return logoPath;
  }
  
  public void setLogoPath(String logoPath) {
    this.logoPath = logoPath;
  }
  
  public String getSlideMasterId() {
    return slideMasterId;
  }
  
  public void setSlideMasterId(String slideMasterId) {
    this.slideMasterId = slideMasterId;
  }

  public String getBackgroundImage() {
    return backgroundImage;
  }

  public void setBackgroundImage(String backgroundImage) {
    this.backgroundImage = backgroundImage;
  }  
}
