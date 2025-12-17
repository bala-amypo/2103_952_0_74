package com.example.demo.conroller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;

@RestController
public class StudentController{
    @Au
    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student st){
        return
    }

}