package com.springboot4.jpatest.service;


import com.springboot4.jpatest.dao.DepartmentRepository;
import com.springboot4.jpatest.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zc
 * @create 2019-05_12-0:55
 */
@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> getAllDept(){
        return departmentRepository.findAll();
    }
}
