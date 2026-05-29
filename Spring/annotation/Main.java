package com.core.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        Person person = context.getBean(Person.class);

        person.setId(101);
        person.setName("Rahul");

        System.out.println(person);
    }
}
