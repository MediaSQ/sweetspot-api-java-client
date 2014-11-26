package com.sweetspot.api.models;

public class AnalystOpinion {
  private String userName;
  private String userEmail;
  private String opinion;
  
  public AnalystOpinion() {
    
  }

  public AnalystOpinion(String userName, String userEmail, String opinion) {
    super();
    this.userName = userName;
    this.userEmail = userEmail;
    this.opinion = opinion;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  public String getOpinion() {
    return opinion;
  }

  public void setOpinion(String opinion) {
    this.opinion = opinion;
  }
}
