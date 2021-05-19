package spring_rest_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring_rest_api.entity.Employee;
import spring_rest_api.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRestController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> findAll() {
        List<Employee> result = employeeService.getAllEmployees();
        return result;
    }

    @GetMapping("/employees/{id}")
    public Employee findByID(@PathVariable Integer id) {
        return employeeService.findByID(id);
    }
}
