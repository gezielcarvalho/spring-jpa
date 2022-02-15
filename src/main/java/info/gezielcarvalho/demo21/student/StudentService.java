package info.gezielcarvalho.demo21.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents(){
        return List.of(
                new Student(1L,"Geziel","gez@iel",49, LocalDate.of(1972,5,6)),
                new Student(2L,"Josuel","jos@iel",49,LocalDate.of(1972,5,7)),
                new Student(3L,"Jaziel","jaz@iel",49,LocalDate.of(1972,5,8))
        );
    }
}
