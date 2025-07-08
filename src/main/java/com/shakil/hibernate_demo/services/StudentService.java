package com.shakil.hibernate_demo.services;

import com.shakil.hibernate_demo.models.Student;
import com.shakil.hibernate_demo.services.repos.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repo;

    public boolean addStudent(Student std){
        Student res = repo.save(std);

        return res != null;
    }

    public Collection<Student> getAllStudents(){
        return repo.findAll();
    }

    public Student getStudentById(int id){
        return repo.findById(id).orElse(null);
    }
}