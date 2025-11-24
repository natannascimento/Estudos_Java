package com.telusko.SpringJDBCEx.repository;

import com.telusko.SpringJDBCEx.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudantRepository {


    public void save(Student student) {
        System.out.println("Student saved: " + student.getName());
    }

    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        return students;
    }
}
