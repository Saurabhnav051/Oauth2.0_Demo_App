package com.sbiepay.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationConverter;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	
	@Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(authorizeRequests ->
                        authorizeRequests
                                .requestMatchers("/public").permitAll() // Allow access to /public without authentication
                                .requestMatchers("/private").authenticated() // Require authentication for /private
                                .anyRequest().authenticated() // Require authentication for any other request
                )
                .oauth2ResourceServer(oauth2ResourceServer ->
                        oauth2ResourceServer.jwt());
        return http.build();
    }
	
	
}
