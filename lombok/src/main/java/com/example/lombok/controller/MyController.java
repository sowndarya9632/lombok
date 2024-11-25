package com.example.lombok.controller;
import com.example.lombok.dto.RequestDto;
import com.example.lombok.dto.ResponseDto;
import com.example.lombok.entity.Employee;
import com.example.lombok.service.EmployeeServiceDtoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
//@Controller
//ResponseBody
public class MyController {
    @Autowired
    private EmployeeServiceDtoImpl employeeService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseDto addEmployee(@RequestBody RequestDto employee){
        return employeeService.addEmployee(employee);
    }
    @GetMapping
    public List<Employee> getAllEmployee(){

        return employeeService.getAllEmployee();
    }

    }



