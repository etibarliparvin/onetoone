package com.example.lesson9.service;

import com.example.lesson9.dto.request.StudentRequest;
import com.example.lesson9.dto.response.StudentResponse;

import java.util.List;

public interface StudentService {

    StudentResponse create(StudentRequest request);

    List<StudentResponse> findByAge(Integer age);

    Integer rename(String name, Long id);
}
