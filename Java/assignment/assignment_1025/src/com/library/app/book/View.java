package com.library.app.book;

import java.util.ArrayList;

public class View {
  private final int NOTEXIST = 0;
  private final int WRONGINPUT = 1;
  private final int ALLDELETE = 2;
  private final int INVALID = 3;
  private final int DELETE = 4;
  private final int NOTBORROWED = 5;
  private final int BORROWED = 100;
  private final int CURRENTBOOK = 101;
  private final int CURRENT = 102;
  private final int RETURNED = 103;

  public int getNOTEXIST() {
    return NOTEXIST;
  }

  public int getWRONGINPUT() {
    return WRONGINPUT;
  }

  public int getALLDELETE() {
    return ALLDELETE;
  }

  public int getINVALID() {
    return INVALID;
  }

  public int getDELETE() {
    return DELETE;
  }

  public int getNOTBORROWED() {
    return NOTBORROWED;
  }

  public int getBORROWED() {
    return BORROWED;
  }

  public int getCURRENTBOOK() {
    return CURRENTBOOK;
  }

  public int getCURRENT() {
    return CURRENT;
  }

  public int getRETURNED() {
    return RETURNED;
  }

  public void menu() {
    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
    System.out.println("Menu List");
    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
    System.out.println("A : Check the list of books");
    System.out.println("B : Select a book to borrow");
    System.out.println("C : Currently borrowing book(s)");
    System.out.println("D : Returning book(s)");
    System.out.println("E : Delete list");
    System.out.println("Q : Quit");
  }

  public void showBookList(ArrayList<Book> lists) {
    System.out.println("--------------------------------");
    for (int i = 1; i <= lists.size(); i++) {
      System.out.println("Book " + i + ": " + lists.get(i - 1).toString());
    }
    System.out.println("--------------------------------");
    System.out.println("\n");
  }

  public void showBorrow() {
    System.out.println("--------------------------------");
    System.out.println("Enter the number of the book you want to borrow.");
    System.out.println("--------------------------------");
  }

  public void showReturn() {
    System.out.println("--------------------------------");
    System.out.println("Enter the number of the book you want to return.");
    System.out.println("--------------------------------");
  }

  public void showDelete() {
    System.out.println("--------------------------------");
    System.out.println("Enter the number of the book you want to delete.");
    System.out.println("--------------------------------");
  }

  public void showClose() {
    System.out.println("--------------------------------");
    System.out.println("Close the menu list.");
    System.out.println("--------------------------------");
  }

  public void showFinish() {
    System.out.println("Thank you...");
  }

  void errorMessage(int message) {
    System.out.println("\n");
    System.out.println("---------------------------");
    System.out.print("!!! ");
    switch (message) {
    case NOTEXIST:
      System.out.println("Wrong input. Its number does not exist in the list.");
      break;
    case WRONGINPUT:
      System.out.println("Wrong Input! Only integer numbers please...");
      break;
    case ALLDELETE:
      System.out.println("There are currently no books available for borrowing.");
      break;
    case INVALID:
      System.out.println("Invalid Option. Please try again.");
      break;
    case NOTBORROWED:
      System.out.println("You don't currently borrow anything.");
      break;
    default:
      break;
    }
    System.out.println("---------------------------");
    System.out.println("\n");
  }

  void errorMessage(int message, String title) {
    System.out.println("\n");
    System.out.println("---------------------------");
    System.out.print("!!! ");
    switch (message) {
    case BORROWED:
      System.out.println("\"" + title + "\" is already borrowed.");
      break;
    case RETURNED:
      System.out.println("\"" + title + "\" is already returned.");
      break;
    default:
      break;
    }
    System.out.println("---------------------------");
    System.out.println("\n");
  }

  void message(int message) {
    switch (message) {
    case CURRENT:
      System.out.println("You are now borrowing.");
      break;
    default:
      break;
    }
  }

  void message(int message, String title) {
    switch (message) {
    case BORROWED:
      System.out.println("You borrowed \"" + title + "\".");
      break;
    case CURRENTBOOK:
      System.out.println("\"" + title + "\"");
      break;
    case RETURNED:
      System.out.println("You returned \"" + title + "\".");
      break;
    case DELETE:
      System.out.println("You deleted \"" + title + "\".");
      break;
    default:
      break;
    }
  }
}
