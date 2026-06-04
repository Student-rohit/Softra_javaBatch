package com.core.Templete;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(
                        SpringConfig.class);

        Dao dao =
                context.getBean(Dao.class);

        List<Person> list =
                dao.getAll();

        for(Person p : list) {

            System.out.println(
                    p.getPER_ID());

            System.out.println(
                    p.getPER_NAME());

            System.out.println("-----------");
        }
    }
}