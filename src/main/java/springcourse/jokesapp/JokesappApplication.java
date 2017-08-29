package springcourse.jokesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import springcourse.controllers.JokeController;

@SpringBootApplication
public class JokesappApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(JokesappApplication.class, args);
		JokeController jokeController = (JokeController) ctx.getBean("jokeController");


	}
}
