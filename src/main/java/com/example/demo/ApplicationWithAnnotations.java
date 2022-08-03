package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class ApplicationWithAnnotations {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

        System.out.println(person.getSurname());
        System.out.println(person.getAge());

//        Dog dog = context.getBean("dogBean",Dog.class);




        context.close();
    }
}
