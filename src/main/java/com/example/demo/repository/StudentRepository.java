package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.

import com.example.demo.entity.Student;
@repository
public interface Studentrepository extends JpaRepository<Student,Long> {
    
}