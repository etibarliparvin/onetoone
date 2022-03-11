package com.example.lesson9.repository;

import com.example.lesson9.entity.StudentDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDetailsRepository extends JpaRepository<StudentDetail, Long> {
}
