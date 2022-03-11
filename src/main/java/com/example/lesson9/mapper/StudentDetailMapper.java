package com.example.lesson9.mapper;

import com.example.lesson9.dto.request.StudentDetailRequest;
import com.example.lesson9.dto.response.StudentDetailResponse;
import com.example.lesson9.entity.StudentDetail;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentDetailMapper {

    StudentDetail toEntity(StudentDetailRequest request);

    StudentDetailResponse toResponse(StudentDetail studentDetails);
}
