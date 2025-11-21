package com.telusko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;
@Component
public class Alien {

    private int age;
    private Computer computer;

    public Alien() {
        System.out.println("Alien object created!");
    }
//    @ConstructorProperties({"age", "computer"})
//    public Alien(int age, Computer computer) {
//        this.laptop = laptop;
//        this.age = age;
//    }

    public void code() {
        System.out.println("Alien is coding...");
        computer.compile();
    }

    public Computer getComputer() {
        return computer;
    }

    @Autowired
    @Qualifier("laptop")
    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //System.out.println("setter called");
        this.age = age;
    }
}
