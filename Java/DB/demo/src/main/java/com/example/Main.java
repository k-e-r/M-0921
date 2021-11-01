package com.example;

import java.sql.*;

public class Main {
  public static void main(String[] args) throws Exception {
    String url = "jdbc:mysql://localhost:3306/employees_database";
    String user = "root";
    String password = "";
    int rowsAffected;

    try {
      // Establish a connection
      Connection conn = DriverManager.getConnection(url, user, password);
      // Create a statement object to send to database
      Statement statement = conn.createStatement();
      // Send query to database
      ResultSet resultSet = statement.executeQuery("SELECT * FROM employees_tbl");

      while (resultSet.next()) {
        System.out.println(resultSet.getString("name"));
      }

      System.out.println("****************************");
      ResultSet resultSet2 = statement.executeQuery("SELECT * FROM employees_tbl");

      int salaryTotal = 0;
      while (resultSet2.next()) {
        salaryTotal = salaryTotal + resultSet2.getInt("salary");
      }
      System.out.println("Total Salary: " + salaryTotal);

      // Create new employee
      rowsAffected = statement
          .executeUpdate("INSERT INTO employees_tbl (name, department, salary) VALUES ('Mark', 'Marketing', 7000)");
      System.out.println("Executed an INSERT statement - Rows affected: " + rowsAffected);

      // Delete a single statement
      rowsAffected = statement.executeUpdate("DELETE FROM employees_tbl WHERE id = 302");
      System.out.println("Executed a DELETE statement - Rows affected: " + rowsAffected);

      // Update a statement
      rowsAffected = statement.executeUpdate("UPDATE employees_tbl SET salary = 15000 WHERE id = 100");
      System.out.println("Executed an UPDATE statement - Rows affected: " + rowsAffected);
    } catch (Exception e) {
      // TODO: handle exception
      e.printStackTrace();
    }
  }
}
