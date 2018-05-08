package com.example.dockermicro.EmployeeSearchService.controller;

import java.util.Collection;

import com.example.dockermicro.EmployeeSearchService.domain.model.Employee;
import com.example.dockermicro.EmployeeSearchService.service.EmployeeSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RefreshScope
@RestController
public class EmployeeSearchController {
    @Value("${welcome.message}")
    private String welcomeMsg;

    @Autowired
    EmployeeSearchService employeeSearchService;
    @RequestMapping("/employee/find/{id}")
    public Employee findById(@PathVariable Long id) {
        return employeeSearchService.findById(id);
    }
    @RequestMapping("/employee/findall")
    public Collection < Employee > findAll() {
        return employeeSearchService.findAll();
    }

    @RequestMapping("/employee/config/{id}")
    public String config(@PathVariable String id) {
        return welcomeMsg;
    }
}