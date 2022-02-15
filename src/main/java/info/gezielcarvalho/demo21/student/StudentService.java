package info.gezielcarvalho.demo21.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

//    public List<Student> getStudents(){
//        return List.of(
//                new Student(1L,"Geziel","gez@iel",49, LocalDate.of(1972,5,6)),
//                new Student(2L,"Josuel","jos@iel",49,LocalDate.of(1972,5,7)),
//                new Student(3L,"Jaziel","jaz@iel",49,LocalDate.of(1972,5,8))
//        );
//    }
}
