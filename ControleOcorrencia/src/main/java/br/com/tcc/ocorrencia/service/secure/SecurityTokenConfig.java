package br.com.tcc.ocorrencia.service.secure;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@EnableWebSecurity // Enable security config. This annotation denotes config for spring security.
public class SecurityTokenConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	private JwtConfig jwtConfig;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
				.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
				.exceptionHandling()
				.authenticationEntryPoint((req, rsp, e) -> rsp.sendError(HttpServletResponse.SC_UNAUTHORIZED)).and()
				.addFilterAfter(new JwtTokenAuthenticationFilter(jwtConfig), UsernamePasswordAuthenticationFilter.class)
				.authorizeRequests()
				.antMatchers(HttpMethod.POST, jwtConfig.getUri()).permitAll()
				.antMatchers("/swagger-ui.html").permitAll()
				.antMatchers("/webjars/springfox-swagger-ui/**").permitAll()
				.antMatchers("/v2/api-docs/**").permitAll()
				.anyRequest().authenticated();
	}

	@Bean
	public JwtConfig jwtConfig() {
		return new JwtConfig();
	}
}
