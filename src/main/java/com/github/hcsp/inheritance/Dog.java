package com.github.hcsp.inheritance;

public class Dog extends Animal {
    String  name;
    public Dog(String name) {
        this.name = name;
    }

    public void wang() {
        System.out.println("汪" + name);
    }
}
