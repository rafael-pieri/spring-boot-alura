package br.com.alura.viplist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import br.com.alura.emailsender.service.EmailService;

@SpringBootApplication
@ComponentScan(basePackageClasses= {EmailService.class, GuestController.class})
public class Configuration {

	public static void main(String[] args) {
		SpringApplication.run(Configuration.class, args);
	}
	
}
