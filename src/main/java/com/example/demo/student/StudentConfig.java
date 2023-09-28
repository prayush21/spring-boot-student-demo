package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student prayush = new Student(
                    "Prayush",
                    "prayushdave@gmail.com",
                    LocalDate.of(2000, Month.NOVEMBER, 5));

            Student d = new Student(
                    "Dis",
                    "dis@gmail.com",
                    LocalDate.of(2017, Month.NOVEMBER, 21));

            studentRepository.saveAll(List.of(prayush, d));
        };


    }
}
