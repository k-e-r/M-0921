package main;

import java.util.List;

import dto.Employee;
import exception.EmployeeNotFoundException;
import service.EmployeeService;
import service.EmployeeServiceImpl;

public class EmployeeMain {
  public static void main(String[] args) {

    EmployeeService eService = new EmployeeServiceImpl();

    // adding employees
    eService.addEmployee(new Employee(1111, "Michael", "Sales", 28));
    eService.addEmployee(new Employee(2222, "Samuel", "Technology", 25));
    eService.addEmployee(new Employee(3333, "John", "Operations", 30));

    // show all employees
    List<Employee> employeeList = eService.showAllEmployees();

    for (Employee e : employeeList) {
      System.out.println("ID: " + e.getId() + " | Name: " + e.getName() + " | Department: " + e.getDepartment()
          + " | Days Attended: " + e.getDaysAttended());
    }

    // // delete an employee
    // eService.deleteEmployee(1111);

    System.out.println("---------------------------------");

    // find an employee
    try {
      Employee emp = eService.findEmployee(new Employee(2222, "Samuel", "Technology", 25));
      System.out.println("Employee ID: " + emp.getId() + " | Name: " + emp.getName());
    } catch (EmployeeNotFoundException e1) {
      e1.printStackTrace();
    }

    System.out.println("---------------------------------");

    // update an employee
    eService.updateEmployee(new Employee(1111, "Mic", "Marketing", 100));
    List<Employee> employeeList2 = eService.showAllEmployees();

    for (Employee e : employeeList2) {
      System.out.println("ID: " + e.getId() + " | Name: " + e.getName() + " | Department: " + e.getDepartment()
          + " | Days Attended: " + e.getDaysAttended());
    }
  }
}
