package com.example.lesson9.dto.response;

import lombok.Data;

@Data
public class StudentResponse {

    private Long id;
    private String name;
    private Integer age;
    private StudentDetailResponse studentDetail;
}
