package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

//    @Bean
//    CommandLineRunner commandLineRunner(
//            StudentRepository repository) {
//        return args -> {
//            Student matt = new Student(
//                    "Matt",
//                    "matt@gmail.com",
//                    LocalDate.of(2000, Month.JANUARY, 5)
//            );
//            Student john = new Student(
//                    "John",
//                    "john@gmail.com",
//                    LocalDate.of(1990, Month.AUGUST, 30)
//            );
//            repository.saveAll(
//                    List.of(matt,john)
//            );
//        };
//    }
}
