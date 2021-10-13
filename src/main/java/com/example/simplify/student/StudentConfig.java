package com.example.simplify.student;

import java.time.LocalDate;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return arge -> {
            Student avneet = new Student("Avneet", "Avneet@gamil.com", LocalDate.of(2001, 10, 13));

            Student yutish = new Student("Yutish", "Yutish@gamil.com", LocalDate.of(1998, 11, 21));

            repository.saveAll(List.of(avneet, yutish));
        };
    }
}
