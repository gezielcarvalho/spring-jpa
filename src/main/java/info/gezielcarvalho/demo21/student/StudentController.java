package info.gezielcarvalho.demo21.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {

    @GetMapping
    public List<Student> getStudents(){
        return List.of(
                new Student(1L,"Geziel","gez@iel",49, LocalDate.of(1972,5,6)),
                new Student(2L,"Josuel","jos@iel",49,LocalDate.of(1972,5,7)),
                new Student(3L,"Jaziel","jaz@iel",49,LocalDate.of(1972,5,8))
        );
    }
}
