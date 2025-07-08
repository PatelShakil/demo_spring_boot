package com.shakil.hibernate_demo.controllers;

import com.shakil.hibernate_demo.models.Student;
import com.shakil.hibernate_demo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping(path = "/add")
    public ResponseEntity addStudent(@RequestBody Student std){
        System.out.println(std);
        boolean res = studentService.addStudent(std);
        return res ? ResponseEntity.ok().build() : ResponseEntity.badRequest().body(res);
    }

    @GetMapping(path = "/get-all")
    public ResponseEntity getAllStudents(){
        Collection<Student> res = studentService.getAllStudents();

        return ResponseEntity.ok(res);
    }
    @GetMapping(path = "/{id}")
    public ResponseEntity getAllStudents(@PathVariable("id") int id){
        Student res = studentService.getStudentById(id);
        return ResponseEntity.ok(res);
    }
}
