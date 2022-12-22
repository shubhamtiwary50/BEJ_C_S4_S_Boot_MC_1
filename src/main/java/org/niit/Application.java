package org.niit;

import org.niit.services.MessageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		ApplicationContext applicationContext= SpringApplication.run(MessageService.class, args);
        MessageService ms = applicationContext.getBean(MessageService.class);
		System.out.println("------------||----------||-----------");
		System.out.println(ms.printMessage());
	}

}
