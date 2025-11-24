package com.telusko.SpringJDBCEx.service;

import com.telusko.SpringJDBCEx.model.Student;
import com.telusko.SpringJDBCEx.repository.StudantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudantRepository studantRepository;

    public StudantRepository getStudantRepository() {
        return studantRepository;
    }
    @Autowired
    public void setStudantRepository(StudantRepository studantRepository) {
        this.studantRepository = studantRepository;
    }

    public void addStudent(Student student) {
        studantRepository.save(student);
    }

    public List<Student> getStudents() {
        return studantRepository.findAll();
    }
}
