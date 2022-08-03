package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component()
//@Scope("prototype")
public class Cat implements Pet{
    public Cat() {
        System.out.println("cat is created");
    }

    @Override
    public void sey() {
        System.out.println("Мяу");
    }
}
