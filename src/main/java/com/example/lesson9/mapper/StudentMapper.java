package com.example.lesson9.mapper;

import com.example.lesson9.dto.request.StudentRequest;
import com.example.lesson9.dto.response.StudentResponse;
import com.example.lesson9.entity.Student;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    Student toEntity(StudentRequest request);

    StudentResponse toResponse(Student student);
}
