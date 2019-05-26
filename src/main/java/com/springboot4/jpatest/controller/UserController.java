package com.springboot4.jpatest.controller;

import com.springboot4.jpatest.entity.Employee;
import com.springboot4.jpatest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author zc
 * @create 2019-05_26-12:44
 */
@Controller
public class UserController {
    @Autowired
    private EmployeeService employeeService;

    @ResponseBody
    @RequestMapping("/list")
    public Page<Employee> findall(){
        return employeeService.getAllEmps(1,5);
    }
}
