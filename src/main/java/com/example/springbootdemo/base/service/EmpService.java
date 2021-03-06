package com.example.springbootdemo.base.service;

import com.example.springbootdemo.base.bean.Employee;
import com.example.springbootdemo.base.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {

    @Autowired
    private EmployeeMapper employeeMapper;

    public Employee getEmpById(Integer id){
        return employeeMapper.getEmpById(id);
    }

    public void insertEmp(Employee employee){
        employeeMapper.insertEmp(employee);
    }
}
