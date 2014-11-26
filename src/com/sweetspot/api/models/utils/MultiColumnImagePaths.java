package com.sweetspot.api.models.utils;

import java.util.Hashtable;

import com.google.gson.annotations.SerializedName;

public class MultiColumnImagePaths {

  @SerializedName("1col") private Hashtable<String, String> col1;
  @SerializedName("2col") private Hashtable<String, String> col2;
  
  public MultiColumnImagePaths() {
    
  }
  
  public MultiColumnImagePaths(Hashtable<String, String> col1,
      Hashtable<String, String> col2) {
    super();
    this.col1 = col1;
    this.col2 = col2;
  }

  public Hashtable<String, String> getCol1() {
    return col1;
  }

  public void setCol1(Hashtable<String, String> col1) {
    this.col1 = col1;
  }

  public Hashtable<String, String> getCol2() {
    return col2;
  }

  public void setCol2(Hashtable<String, String> col2) {
    this.col2 = col2;
  }
}
