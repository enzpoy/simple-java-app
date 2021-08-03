package login.com.example.login.demo;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//http.authorizeRequests().anyRequest().authenticated().and().formLogin().loginPage("/login").permitAll();
		http.authorizeRequests().antMatchers("/admin").hasRole("Admin").antMatchers("/user").hasAnyRole("User","Admin").antMatchers("/").permitAll().and().formLogin();
	}
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("user1").password("{noop}password1").roles("User").and().withUser("admin1").password("{noop}password1").roles("Admin");

	
	}

}
