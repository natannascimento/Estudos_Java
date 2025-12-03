package com.telusko.pring_data_jpa_ex;

import com.telusko.pring_data_jpa_ex.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class PringDataJpaExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(PringDataJpaExApplication.class, args);

        StudentRepo repo = context.getBean(StudentRepo.class);

//        Student s1 = context.getBean(Student.class);
//        Student s2 = context.getBean(Student.class);
//        Student s3 = context.getBean(Student.class);
//
//        s1.setRollNo(1);
//        s1.setName("Alice");
//        s1.setMarks(85);
//
//        s2.setRollNo(2);
//        s2.setName("Bob");
//        s2.setMarks(90);
//
//        s3.setRollNo(3);
//        s3.setName("Charlie");
//        s3.setMarks(95);
//
//
//        repo.save(s2);
//        repo.save(s3);

//        Optional<Student> student = repo.findById(4);
//
//        System.out.println(student.orElse(new Student()));
        //System.out.println(repo.findAll());

        //repo.findByName("Alice").forEach(System.out::println);
        //repo.findByMarks(95).forEach(System.out::println);
        repo.findByMarksGreaterThan(86).forEach(System.out::println);

	}

}
