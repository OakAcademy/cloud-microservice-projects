package com.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.example.security.UserService;

import ch.qos.logback.core.pattern.color.BoldCyanCompositeConverter;
import jakarta.activation.DataSource;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
	@Autowired
	private UserService userService;
	@Autowired
	private DataSource dataSource;
	@Autowired
	private LoginSuccessHandler loginSuccessHandler;

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

		auth.userDetailsService(userService).passwordEncoder(passwordEncoder());
	}

	@SuppressWarnings({ "depraction", "deprecation" })
	@Bean
	protected SecurityFilterChain configure(HttpSecurity http) throws Exception{
		http.csrf(x->x.disable()).authorizeRequests(y->{
		
				try {
					y.requestMatchers("/resources/**","/webjars/**","/assets/**").permitAll()
					.requestMatchers("/").permitAll()
					.requestMatchers("/Admin/**").hasRole("Admin").anyRequest().authenticated()
					.and().formLogin().loginPage("Login").successHandler(loginSuccessHandler)
					.failureUrl("/Login?error").permitAll()
					.and().logout()
					.logoutRequestMatcher(new AntPathRequestMatcher("/Logout"))
					.logoutSuccessUrl("Login?logout").deleteCookies("mycookies").permitAll()
					.and().rememberMe().rememberMeCookieName("mycookies").tokenRepository(persistentTokenRepository())
					.tokenValiditySeconds(24*60*60)
					.and().exceptionHandling();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}}).httpBasic(Customizer.withDefaults());
				
			return http.build();
		
	
	}


	PersistentTokenRepository persistentTokenRepository() {

		JdbcTokenRepositoryImpl tokenrepositoryImpl = new JdbcTokenRepositoryImpl();
		tokenrepositoryImpl.setDataSource((javax.sql.DataSource) dataSource);
		return tokenrepositoryImpl;
	}

}
