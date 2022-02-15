package info.gezielcarvalho.demo21.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student geziel = new Student(1L,"Geziel","gez@iel",49, LocalDate.of(1972,5,6));
            Student josuel = new Student(2L,"Josuel","jos@iel",49, LocalDate.of(1972,5,7));
            Student jaziel = new Student(3L,"Jaziel","jaz@iel",49,LocalDate.of(1972,5,8));
            repository.saveAll(List.of(geziel,josuel,jaziel));
        };
    }

}
