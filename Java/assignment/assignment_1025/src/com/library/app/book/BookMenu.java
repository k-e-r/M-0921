package com.library.app.book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {
  private final int borrow = 1;

  View view = new View();
  BookFunction func = new BookFunction();

  Book momo = new Book("MOMO", "Michael Ende", 1973, borrow);
  Book queen = new Book("The Flowing Queen", "Kai Meyer", 2001, borrow);
  Book sophie = new Book("Sophie's World", "Jostein Gaarder", 1991, borrow);

  ArrayList<Book> lists = new ArrayList<Book>() {
    {
      add(momo);
      add(queen);
      add(sophie);
    }
  };

  public void showMenu() {
    char option;
    Scanner scanner = new Scanner(System.in);
    FIN: do {
      view.menu();
      option = scanner.next().charAt(0);
      System.out.println("\n");

      switch (Character.toLowerCase(option)) {
      case 'a':
        view.showBookList(lists);
        break;

      case 'b':
        view.showBookList(lists);
        view.showBorrow();
        try {
          func.borrowBook(lists, scanner.nextInt());
        } catch (Exception e) {
          view.errorMessage(view.getWRONGINPUT());
          scanner.nextLine();
        }
        break;

      case 'c':
        func.currentBook(lists);
        break;

      case 'd':
        view.showBookList(lists);
        view.showReturn();
        try {
          func.returnBook(lists, scanner.nextInt());
        } catch (Exception e) {
          view.errorMessage(view.getWRONGINPUT());
          scanner.nextLine();
        }
        break;

      case 'e':
        view.showBookList(lists);
        view.showDelete();
        try {
          func.deleteBook(lists, scanner.nextInt());
          if (lists.size() == 0) {
            view.errorMessage(view.getALLDELETE());
            break FIN;
          }
        } catch (Exception e) {
          view.errorMessage(view.getWRONGINPUT());
          scanner.nextLine();
        }
        break;

      case 'q':
        view.showClose();
        break;

      default:
        view.errorMessage(view.getINVALID());
        break;
      }
    } while (Character.toLowerCase(option) != 'q');
    view.showFinish();
    scanner.close();
  }
}
