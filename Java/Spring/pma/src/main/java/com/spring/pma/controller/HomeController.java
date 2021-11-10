package com.spring.pma.controller;

import java.util.List;

import com.spring.pma.dao.iEmployeeRepository;
import com.spring.pma.dao.iProjectRepository;
import com.spring.pma.entity.Employee;
import com.spring.pma.entity.Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  @Autowired
  iProjectRepository proRepo;
  @Autowired
  iEmployeeRepository empRepo;

  @GetMapping("/")
  public String displayHome(Model model) {
    List<Project> projects = proRepo.findAll();
    List<Employee> employees = empRepo.findAll();
    model.addAttribute("projectList", projects);
    model.addAttribute("employeeList", employees);
    return "main/home";
  }
}
