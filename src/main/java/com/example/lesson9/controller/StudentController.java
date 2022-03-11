package com.example.lesson9.controller;

import com.example.lesson9.dto.request.StudentRequest;
import com.example.lesson9.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService service;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody StudentRequest request) {
        return ResponseEntity.ok(service.create(request));
    }

    @GetMapping("/age")
    public ResponseEntity<?> find(@RequestParam(name = "age") Integer age) {
        return ResponseEntity.ok(service.findByAge(age));
    }

    @PostMapping("/rename")
    public ResponseEntity<?> rename(@RequestParam String name, @RequestParam Long id) {
        return ResponseEntity.ok(service.rename(name, id));
    }
}
