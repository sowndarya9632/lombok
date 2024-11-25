package com.example.lombok.service;

import java.util.List;

import com.example.lombok.dto.RequestDto;
import com.example.lombok.dto.ResponseDto;
import com.example.lombok.entity.Employee;


public interface EmployeeDtoService {
    //EmployeeDto addEmployee(Employee employee);
    ResponseDto addEmployee(RequestDto  requestDTO );

    List<Employee> getAllEmployee();


}
