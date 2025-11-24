package test.example.test_spring_gradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "test.example")
@EnableJpaRepositories(basePackages = "test.example.repository")
@EntityScan(basePackages = "test.example.models")
public class TestSpringGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestSpringGradleApplication.class, args);
	}

}
