package com.example.lesson9.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;

@Entity
@Data
@Table(name = "student")
@NoArgsConstructor
@AllArgsConstructor
//@NamedQueries({
//        @NamedQuery(name = "selectStudentById",
//                query = "select s from Student s where s.id = :id")
//})
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private StudentDetail studentDetail;
}
