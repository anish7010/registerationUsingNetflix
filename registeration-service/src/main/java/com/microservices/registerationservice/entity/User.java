package com.microservices.registerationservice.entity;

public class User {
  
  private String name;
  private long number;
  private String user_name;
  private String password;
  
  public User(String name, long number, String user_name, String password) {
    super();
    this.name = name;
    this.number = number;
    this.user_name = user_name;
    this.password = password;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getNumber() {
    return number;
  }

  public void setNumber(long number) {
    this.number = number;
  }

  public String getUser_name() {
    return user_name;
  }

  public void setUser_name(String user_name) {
    this.user_name = user_name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
  
  
  
}
