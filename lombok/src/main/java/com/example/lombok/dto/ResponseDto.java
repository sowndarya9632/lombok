package com.example.lombok.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDto {
    private long emp_id;
    private String fName;
    private String lName;
    private String address;
    private int age;
    private LocalDate doj;

}
