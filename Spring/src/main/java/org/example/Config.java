package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "org.example")
public class Config {

    @Bean
    public Parrot parrot() {
        Parrot parrot = new Parrot();
        parrot.setName("DODO");
        return parrot;
    }

    @Bean
    @Primary
    public Parrot parrot2() {
        Parrot parrot = new Parrot();
        parrot.setName("JOJO");
        return parrot;
    }

    @Bean
    public Person person() {
        Person person = new Person();
        person.setName("John");
        return person;
    }

}
