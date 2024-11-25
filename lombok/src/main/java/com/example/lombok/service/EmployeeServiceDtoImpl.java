package com.example.lombok.service;

import java.util.List;

import com.example.lombok.dto.RequestDto;
import com.example.lombok.dto.ResponseDto;
import com.example.lombok.entity.Employee;
import com.example.lombok.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class EmployeeServiceDtoImpl implements EmployeeDtoService {
	private EmployeeRepository employeeRepository;

	public EmployeeServiceDtoImpl(EmployeeRepository employeeRepository) {

		this.employeeRepository = employeeRepository;
	}

	public ResponseDto addEmployee(RequestDto requestDto)
	{
		Employee employee = new Employee(requestDto);
		return mapToDTO(employeeRepository.save(employee));
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}


	private ResponseDto mapToDTO(Employee employee) {
		ResponseDto responseDto = new ResponseDto();
		responseDto.setEmp_id(employee.getId());
		responseDto.setFName(employee.getFName());
		responseDto.setLName(employee.getLName());
		responseDto.setAge(employee.getAge());
		responseDto.setAddress(employee.getAddress());
		responseDto.setDoj(employee.getDoj());
		return responseDto;
	}

}
