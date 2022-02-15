package info.gezielcarvalho.demo21;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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

	@GetMapping
	public List<String> Hello(){
		return List.of("Hello", "World");
	}
}
