package com.luv2code.springboot.thymleafdemo.repository;

import com.luv2code.springboot.thymleafdemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it ... no need to write any code LOL!

    // sort by the last name
    public List<Employee> findAllByOrderByLastNameAsc();

}
