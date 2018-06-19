package com.udemy.cursomc.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.udemy.cursomc.services.DBService;
import com.udemy.cursomc.services.EmailService;
import com.udemy.cursomc.services.MockEmailService;

@Configuration
@Profile("test")
public class TestConfig {

	@Autowired
	private DBService dbService;
	
	@Bean
	public boolean instantiateDatabase() throws ParseException {
		dbService.instantiateTestDatabase();
		return true;
	}
	
	/* 
	 * Obs: @Bean indica que objeto estara disponivel como componente no sistema
	 *      no caso abaixo, sempre que for declarado objeto EmailService e feita
	 *      injecao de dependencia (Autowired), Spring ira procurar por um componente
	 *      para devolver a instancia certa, neste caso sera instanciado objeto do tipo 
	 *      MockEmailService automaticamente, cfme. implementado abaixo
	 */
	@Bean
	public EmailService emailService() {
		return new MockEmailService();
	}
	
}
