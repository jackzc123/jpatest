package com.springboot4.jpatest.service;


import com.springboot4.jpatest.dao.EmployeeRepository;
import com.springboot4.jpatest.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * @author zc
 * @create 2019-05_11-17:41
 */
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Transactional(readOnly=true)
    public Page<Employee> getAllEmps(int pageNum, int pageSize){
        PageRequest pageRequest = new PageRequest(pageNum - 1, pageSize);
        Page<Employee> page = employeeRepository.findAll(pageRequest);
        return page;
    }

    public void saveEmp(Employee employee){
        employeeRepository.save(employee);
    }

    public void deleteEmp(Integer id){
        employeeRepository.deleteById(id);
    }

    public Optional<Employee> getEmp(Integer id){
        return employeeRepository.findById(id);
    }

}
