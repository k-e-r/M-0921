package com.library.app.user;

public class User<s1, s2> {

  private final s1 userName;
  private final s2 userId;

  public User(s1 userName, s2 userId) {
    this.userName = userName;
    this.userId = userId;
  }

  public s1 getUserName() {
    return userName;
  }

  public s2 getUserId() {
    return userId;
  }
}
