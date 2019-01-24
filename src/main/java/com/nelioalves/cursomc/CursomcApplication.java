package com.nelioalves.cursomc;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.nelioalves.cursomc.services.EmailService;
import com.nelioalves.cursomc.services.SmtpEmailService;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {
	
	@Bean
	 public EmailService emailService() {
	     return new SmtpEmailService();
	 }
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		
	}
}