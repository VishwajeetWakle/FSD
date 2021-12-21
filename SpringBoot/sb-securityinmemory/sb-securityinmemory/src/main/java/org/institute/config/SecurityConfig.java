package org.institute.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.withUser("admin").password("admin@123").roles("ADMIN")
		.and()
		.withUser("S1").password("S1@123").roles("STAFF")
		.and()
		.withUser("S2").password("S2@123").roles("STAFF");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	
		http.authorizeHttpRequests()
		.antMatchers("/admin/**").hasAnyRole("ADMIN")
		.antMatchers("/staff/**").hasAnyRole("STAFF","ADMIN")
		.and().formLogin();
	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
}
