package com.telusko;

public class Alien {

    private int age;

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
    }
}
