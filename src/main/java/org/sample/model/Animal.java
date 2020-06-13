package org.sample.model;

public class Animal {
    private int age;
    private String name;

    public Animal() {
        age = 0;
        name = "noname";
    }

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Animal({}, {})", age, name);
    }
}