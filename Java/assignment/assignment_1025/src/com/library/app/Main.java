package com.library.app;

import com.library.app.book.BookMenu;
import com.library.app.user.User;

public class Main {
  public static void main(String[] args) throws Exception {
    User<String, String> account = new User<>("dummy", "user001");
    System.out.println("\n");
    System.out.println("Welcome " + account.getUserName());
    System.out.println("Your ID is: " + account.getUserId());
    System.out.println("\n");

    BookMenu books = new BookMenu();
    books.showMenu();
  }
}
