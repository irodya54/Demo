package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component()
public class Dog implements Pet{
//    private String name;

    public Dog() {
        System.out.println("Dog bean is created");
    }


    @Override
    public void sey() {
        System.out.println("Гав гав");
    }
    @PostConstruct
    public void init() {
        System.out.println("Class Dog: init method");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("Class Dog: destroy method");
    }
}
