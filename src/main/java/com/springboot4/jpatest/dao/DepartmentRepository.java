package com.springboot4.jpatest.dao;

import com.springboot4.jpatest.entity.Department;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * @author zc
 * @create 2019-05_12-0:54
 */
public interface DepartmentRepository extends Repository<Department, Integer> {

    @Query("from Department")
    List<Department> findAll();
}
