package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext    context = new AnnotationConfigApplicationContext(Config.class);
        Person person = context.getBean(Person.class);
        System.out.println(person.getParrot().getName());
    }
}
