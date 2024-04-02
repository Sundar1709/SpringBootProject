package dev.sundaram.runnerz;

import dev.sundaram.runnerz.run.Location;
import dev.sundaram.runnerz.run.Run;
import dev.sundaram.runnerz.run.RunRepository;
import foo.bar.WelcomeMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class Application {
 private static  final Logger log = LoggerFactory.getLogger(Application.class);
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
//@Bean
//	// it will run after the application start
//	CommandLineRunner runner(RunRepository runRepository){
//		//this is anonymous function
//		return  args -> {
//			Run run =new Run(1,"first run", LocalDateTime.now(),LocalDateTime.now().plus(1, ChronoUnit.HOURS),3 , Location.Outdoor);
//            runRepository.create(run);
//		};
//	}
	// commandline runner is functional interface(that has single abstract method and because it is a functional interface that can be used as lambda expression) that will be run after the application started
}
