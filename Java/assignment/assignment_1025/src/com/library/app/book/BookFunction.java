package com.library.app.book;

import java.util.ArrayList;

public class BookFunction {
  View view = new View();

  String checkTitle(ArrayList<Book> lists, int bookNum) {
    return lists.get(bookNum - 1).getTitle();
  }

  boolean checkNum(ArrayList<Book> lists, int bookNum) {
    return (bookNum > 0 && bookNum <= lists.size());
  }

  void borrowBook(ArrayList<Book> lists, int bookNum) {
    if (checkNum(lists, bookNum) && lists.get(bookNum - 1).getBorrow() != 0) {
      lists.get(bookNum - 1).setBorrow(0);
      view.message(view.getBORROWED(), checkTitle(lists, bookNum));
    } else if (checkNum(lists, bookNum)) {
      view.errorMessage(view.getBORROWED(), checkTitle(lists, bookNum));
    } else {
      view.errorMessage(view.getNOTEXIST());
    }
  }

  void currentBook(ArrayList<Book> lists) {
    int cnt = 0;
    for (Book book : lists) {
      if (book.getBorrow() == 0) {
        view.message(view.getCURRENTBOOK(), book.getTitle());
        cnt++;
      }
    }
    if (cnt == 0)
      view.errorMessage(view.getNOTBORROWED());
    else
      view.message(view.getCURRENT());
  }

  void returnBook(ArrayList<Book> lists, int bookNum) {
    if (checkNum(lists, bookNum) && lists.get(bookNum - 1).getBorrow() == 0) {
      lists.get(bookNum - 1).setBorrow(1);
      view.message(view.getRETURNED(), checkTitle(lists, bookNum));
    } else if (checkNum(lists, bookNum)) {
      view.errorMessage(view.getRETURNED(), checkTitle(lists, bookNum));
    } else {
      view.errorMessage(view.getNOTEXIST());
    }
  }

  void deleteBook(ArrayList<Book> lists, int bookNum) {
    if (checkNum(lists, bookNum)) {
      view.message(view.getDELETE(), checkTitle(lists, bookNum));
      lists.remove(bookNum - 1);
    } else {
      view.errorMessage(view.getNOTEXIST());
    }
  }

}
