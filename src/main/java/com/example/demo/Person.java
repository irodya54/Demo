package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {
//    @Autowired
//    @Qualifier("cat")
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

//    @Autowired
    public Person(Pet pet) {
        System.out.println("Person is created");
        this.pet = pet;
    }

    public Person() {
        System.out.println("Constructor not parameters");
    }

    //    @Autowired
    public void setPet(Pet pet) {
        System.out.println("Class person: setPet");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello my pet");
        pet.sey();
    }

    public Pet getPet() {
        return pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
