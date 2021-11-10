package com.spring.pma.dao;

import java.util.List;

import com.spring.pma.entity.Project;

import org.springframework.data.repository.CrudRepository;

public interface iProjectRepository extends CrudRepository<Project, Long> {

  @Override
  public List<Project> findAll();
}
