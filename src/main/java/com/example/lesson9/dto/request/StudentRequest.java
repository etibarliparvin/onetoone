package com.example.lesson9.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentRequest {

    private String name;
    private Integer age;
    private StudentDetailRequest studentDetailRequest;
}
