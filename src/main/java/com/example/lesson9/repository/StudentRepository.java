package com.example.lesson9.repository;

import com.example.lesson9.dto.response.StudentResponse;
import com.example.lesson9.entity.Student;
import org.hibernate.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findAllByAgeGreaterThanEqual(Integer age);

    @Query(value = "select * from student where student.age > ?", nativeQuery = true)
    List<Student> getStudentsByAneGreaterThan(Integer age);

    @Modifying
    @Transactional
    @Query(value = "update student set name = ?1 where id = ?2", nativeQuery = true)
    Integer rename(String name, Long id);

    @Query(value = "select s from Student s where s.age > :age")
    List<Student> getStudentsByAneGreaterThanJpql1(@Param("age") Integer age);

    @Query(value = "select s from Student s where s.age > ?1")
    List<Student> getStudentsByAneGreaterThanJpql2(@Param("age") Integer age);
}
