package com.luv2code.springboot.thymleafdemo.controller;

import com.luv2code.springboot.thymleafdemo.entity.Employee;
import com.luv2code.springboot.thymleafdemo.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/getList")
    public String getEmployees(Model theModel){

        //Get the employees from db
        List<Employee> theEmployee = employeeService.findAll();

        //add them to the model
        theModel.addAttribute("employees", theEmployee);

        //return html page
        return "employees/list-employee";

    }

    @GetMapping("/showFormForAdd")
    public String showform(Model themodel){

        // create employee attribute
        Employee theEmployee = new Employee();
        // add attribute for data binding

        themodel.addAttribute("employee", theEmployee);

        return "employees/employee-form";
    }


    @PostMapping("/save")
    public String saveEmp(@ModelAttribute("employee") Employee theEmployee){
        // save the employee to db
        employeeService.save(theEmployee);

        //add a redirect to list page to avoid duplication
        return "redirect:/employees/getList";
    }


    @GetMapping("showFormToUpdate")
    public String forToUpdate(@RequestParam("employeeId") int theId, Model theModel){

        Employee theEmployee = employeeService.findById(theId);

        theModel.addAttribute("employee",theEmployee);

        return "employees/employee-form";
    }


    @GetMapping("delete")
    public String delete(@RequestParam("employeeId") int Id){

        employeeService.deleteById(Id);

        return "redirect:/employees/getList";
    }
}
