package com.example.lesson9.service;

import com.example.lesson9.dto.request.StudentRequest;
import com.example.lesson9.dto.response.StudentResponse;
import com.example.lesson9.mapper.StudentMapper;
import com.example.lesson9.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;
    private final StudentMapper mapper;

    @Override
    public StudentResponse create(StudentRequest request) {
        return mapper.toResponse(repository.save(mapper.toEntity(request)));
    }

    @Override
    public List<StudentResponse> findByAge(Integer age) {
        return repository.getStudentsByAneGreaterThanJpql2(age).stream().map(mapper::toResponse).collect(Collectors.toList());
    }

    @Override
    public Integer rename(String name, Long id) {
//        return mapper.toResponse(repository.rename(name, id));
        return repository.rename(name, id);
    }
}
