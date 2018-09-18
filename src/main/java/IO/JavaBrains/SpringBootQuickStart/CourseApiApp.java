package IO.JavaBrains.SpringBootQuickStart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "IO.JavaBrains.SpringBootQuickStart.hello")
@ComponentScan(basePackages = "IO.JavaBrains.SpringBootQuickStart.topics")
public class CourseApiApp {

	public static void main(String[] args) {
		
		SpringApplication.run(CourseApiApp.class, args);

	}

}
