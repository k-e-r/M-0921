package com.library.app.book;

public class Book {
  private String title;
  private String author;
  private int year;
  private int borrow;

  public Book(String title, String author, int year, int borrow) {
    this.title = title;
    this.author = author;
    this.year = year;
    this.borrow = borrow;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public int getYear() {
    return year;
  }

  public int getBorrow() {
    return borrow;
  }

  public void setBorrow(int borrow) {
    this.borrow = borrow;
  }

  @Override
  public String toString() {
    return "\n Title: " + title + "\n Author: " + author + "\n Year: " + year + "\n Borrow: " + borrow;
  }
}