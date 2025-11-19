package com.telusko;

public class Alien {

    private int age;
    private Laptop laptop;

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

    public Alien() {
        System.out.println("Alien object created!");
    }

    public void code() {
        System.out.println("Alien is coding...");
        laptop.compile();
    }
}
