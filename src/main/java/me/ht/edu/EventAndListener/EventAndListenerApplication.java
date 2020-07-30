package me.ht.edu.EventAndListener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EventAndListenerApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(EventAndListenerApplication.class);
		application.addListeners(new StartingEventListener());
		application.run(args);
	}

}
