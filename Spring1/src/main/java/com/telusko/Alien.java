package com.telusko;

import java.beans.ConstructorProperties;

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
