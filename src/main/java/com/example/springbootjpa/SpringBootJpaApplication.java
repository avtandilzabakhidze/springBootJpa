package com.example.springbootjpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJpaApplication.class, args);
    }
@Bean
    CommandLineRunner commandLineRunner (StudentRepository repository){
            return args -> {
                Student maria = new Student("anna", "jo", "anna@gmail.com", 23);
                repository.save(maria);
            };

}
}
