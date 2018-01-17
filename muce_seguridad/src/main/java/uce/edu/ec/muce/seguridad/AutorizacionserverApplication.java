package uce.edu.ec.muce.seguridad;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@RestController
@EnableResourceServer
@EnableDiscoveryClient 
public class AutorizacionserverApplication extends WebMvcConfigurerAdapter {
	
	
	@RequestMapping("/user")
	  public Principal user(Principal user) {
	    return user;
	  }



	public static void main(String[] args) {
		SpringApplication.run(AutorizacionserverApplication.class, args);
	}

	
	
	
}



