package dev.chainguard.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

/**
 * Spring Security 6.5.11 configuration using the component-based DSL.
 *
 * The /version endpoint is public (demonstrates permitAll from the 6.x DSL).
 * Everything else requires an authenticated principal, except the actuator
 * health endpoint which is also open for liveness probes.
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/version", "/actuator/health").permitAll()
                .anyRequest().authenticated()
            )
            .httpBasic(httpBasic -> {})
            .csrf(csrf -> csrf.disable())
            .build();
    }
}
