package info.gezielcarvalho.demo21;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo21Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo21Application.class, args);
	}

	@GetMapping
	public String Hello(){
		return "Hello World";
	}

}
