package com.shakil.hibernate_demo.services.repos;

import com.shakil.hibernate_demo.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
