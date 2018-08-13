package uce.edu.ec.muce.seguridad;

import java.security.Principal;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.Ordered;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;



@SpringBootApplication
@RestController
public class AutorizacionserverApplication extends WebMvcConfigurerAdapter {
	
	
	@RequestMapping("/user")
	  public Principal user(Principal user) {
	    return user;
	  }


	@Autowired
	private UsuarioRepositorio userRepository;
	
	@Autowired
	private RolUsuarioRepositorio rolUsuarioRepositorio;
	
	private PasswordEncoder passwordEncoder =new BCryptPasswordEncoder();

	@RequestMapping(value = "/active", method = RequestMethod.POST )
	  public String validarActiveDirectori(@Valid @RequestBody Credenciales body) {
		
		if(true) {
			Usuario u =userRepository.findOneByUsername(body.getUsuario());	
			if(u==null) {
				Usuario nuevo= new Usuario();
				nuevo.setNombres(body.getUsuario());
				nuevo.setUsername(body.getUsuario());
				nuevo.setEnabled(true);
				nuevo.setPassword(passwordEncoder.encode(body.getPassword()));
				userRepository.save(nuevo);
				
				RolUsuario rolUsuario = new RolUsuario();
				rolUsuario.setRolId(new Rol(5L));
				rolUsuario.setUsrId(nuevo);
				rolUsuarioRepositorio.save(rolUsuario);
				
				return "0000003";
				
			}else {				
				u.setPassword(passwordEncoder.encode(body.getPassword()));				
				userRepository.save(u);
				return "0000002";
			}
			//return body.getUsuario()+" "+body.getPassword();
		}else {
			return "0000001";
		}
			    	
	  }
	
	public static void main(String[] args) {
		SpringApplication.run(AutorizacionserverApplication.class, args);
	}

	@Bean
	public FilterRegistrationBean corsFilte1r() {
	    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
	    
	    CorsConfiguration configAutenticacao = new CorsConfiguration();
	    configAutenticacao.setAllowCredentials(true);
	    configAutenticacao.addAllowedOrigin("*");
	    configAutenticacao.addAllowedHeader("Authorization");
	    configAutenticacao.addAllowedHeader("Content-Type");
	    configAutenticacao.addAllowedHeader("Accept");
	    configAutenticacao.addAllowedMethod("POST");
	    configAutenticacao.addAllowedMethod("GET");
	    configAutenticacao.addAllowedMethod("DELETE");
	    configAutenticacao.addAllowedMethod("PUT");
	   // configAutenticacao.addAllowedMethod("OPTIONS");
	    configAutenticacao.setMaxAge(3600L);
	    source.registerCorsConfiguration("/**", configAutenticacao);
	    // source.registerCorsConfiguration("/**", configAutenticacao); // Global for all paths
	    
	    FilterRegistrationBean bean = new FilterRegistrationBean(new CorsFilter(source));
	    bean.setOrder(Ordered.HIGHEST_PRECEDENCE);
	    return bean;
	}
	
	
}



