package info.gezielcarvalho.demo21;

import info.gezielcarvalho.demo21.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@RestController
public class Demo21Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo21Application.class, args);
	}

//	@GetMapping
//	public String Hello(){
//		return "Hello World";
//	}

//	@GetMapping
//	public List<String> Hello(){
//		return List.of("Hello", "World");
//	}

	@GetMapping
	public List<Student> Hello(){
		return List.of(
				new Student(1L,"Geziel","gez@iel",49,LocalDate.of(1972,5,6)),
				new Student(2L,"Josuel","jos@iel",49,LocalDate.of(1972,5,7)),
				new Student(3L,"Jaziel","jaz@iel",49,LocalDate.of(1972,5,8))
		);
	}
}
