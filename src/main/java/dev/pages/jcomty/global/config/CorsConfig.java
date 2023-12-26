package dev.pages.jcomty.global.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
public class CorsConfig {
	private static final String FRONT_PROD_ENV = "https://this-year-ajaja-fe.vercel.app/";
	private static final String FRONT_LOCAL_ENV = "http://localhost:5173/";

	private final List<String> allowedMethods = List.of("GET", "POST", "PUT", "DELETE", "OPTIONS", "PATCH");

	@Bean
	CorsConfigurationSource corsConfigurationSource() {
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", defaultCorsConfig());
		source.registerCorsConfiguration("/mock/**", mockCorsConfig());
		return source;
	}

	private CorsConfiguration defaultCorsConfig() {
		CorsConfiguration configuration = new CorsConfiguration();
		configuration.setAllowedOrigins(List.of(FRONT_PROD_ENV, FRONT_LOCAL_ENV));
		configuration.setAllowedMethods(allowedMethods);
		configuration.addAllowedHeader("*");
		configuration.setAllowCredentials(true);
		return configuration;
	}

	private CorsConfiguration mockCorsConfig() {
		CorsConfiguration configuration = new CorsConfiguration();
		configuration.setAllowedOrigins(List.of(FRONT_LOCAL_ENV));
		configuration.setAllowedMethods(allowedMethods);
		configuration.addAllowedHeader("*");
		configuration.setAllowCredentials(true);
		return configuration;
	}
}
