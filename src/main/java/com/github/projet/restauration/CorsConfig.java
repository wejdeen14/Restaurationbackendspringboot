package com.github.projet.restauration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {

    
        @Bean
        public CorsFilter corsFilter() {
            UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
            CorsConfiguration config = new CorsConfiguration();
            config.setAllowCredentials(false);
            config.addAllowedOrigin("http://localhost:3000"); // Remplacez par l'URL de votre application React
            config.addAllowedHeader("*"); // Autorise tous les en-têtes
            config.addAllowedMethod("GET");
            source.registerCorsConfiguration("/api/reservation/reservations", config);
            return new CorsFilter(source);
        }
    }
    
