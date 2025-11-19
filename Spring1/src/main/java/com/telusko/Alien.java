package com.telusko;

import java.beans.ConstructorProperties;

public class Alien {

    private int age;
    private Laptop laptop;

    public Alien() {
        System.out.println("Alien object created!");
    }
    @ConstructorProperties({"age", "laptop"})
    public Alien(int age, Laptop laptop) {
        this.laptop = laptop;
        this.age = age;
    }

    public void code() {
        System.out.println("Alien is coding...");
        laptop.compile();
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("setter called");
        this.age = age;
    }
}
