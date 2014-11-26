package com.sweetspot.api.models;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TypeBuilder {
  
  private static TypeBuilder instance;
  private Gson gson;
  
  private TypeBuilder() {
    this.gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
  }
  
  public static TypeBuilder instance() {
    if(instance == null) {
      instance = new TypeBuilder();
    }
    
    return instance;
  }
  
  public <T> T buildFromJSON(String json, Class<T> klass){
    return this.gson.fromJson(json, klass);
  }
}
