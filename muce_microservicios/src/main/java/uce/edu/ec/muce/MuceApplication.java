package uce.edu.ec.muce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableScheduling
@EnableAutoConfiguration
@SpringBootApplication
@EnableDiscoveryClient
@EnableResourceServer
@EnableAsync
//@EnableFeignClients
public class MuceApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(MuceApplication.class, args);
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
//	@Bean
//	public JavaMailSender getJavaMailSender() {
//		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
//		mailSender.setHost("smtp.gmail.com");
//	    mailSender.setPort(587);
//	     
//	    mailSender.setUsername("");
//	    mailSender.setPassword("");
//	     
//	    Properties props = mailSender.getJavaMailProperties();
//	    props.put("mail.transport.protocol", "smtp");
//	    props.put("mail.smtp.auth", "true");
//	    props.put("mail.smtp.starttls.enable", "true");
//	    props.put("mail.debug", "true");
//	     
//	    return mailSender;
//	}
//	
	
}
