package info.gezielcarvalho.demo21.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public void addNewStudent(Student student) {
        Optional<Student> studentOptional = studentRepository.findStudentByEmail(student.getEmail());
        if (studentOptional.isPresent()) {
            throw new IllegalStateException("Student already exists");
        }
        studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        boolean exists = studentRepository.existsById(id);
        if (!exists){
            throw new IllegalStateException("Student #"+id+" doesn't exist");
        }
        studentRepository.deleteById(id);
    }

//    public List<Student> getStudents(){
//        return List.of(
//                new Student(1L,"Geziel","gez@iel",49, LocalDate.of(1972,5,6)),
//                new Student(2L,"Josuel","jos@iel",49,LocalDate.of(1972,5,7)),
//                new Student(3L,"Jaziel","jaz@iel",49,LocalDate.of(1972,5,8))
//        );
//    }
}
