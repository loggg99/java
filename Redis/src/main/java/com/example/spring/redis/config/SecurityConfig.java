package com.example.spring.redis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.data.redis.connection.RedisConnectionFactory;
//import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
//import org.springframework.data.redis.connection.lettuce.LettuceClientConfiguration;
//import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

import java.time.Duration;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
//@EnableRedisHttpSession // Enables Redis to store session data
public class SecurityConfig {

//    @Bean
//    public RedisConnectionFactory redisConnectionFactory() {
//        LettuceClientConfiguration clientConfig = LettuceClientConfiguration.builder()
//                .commandTimeout(Duration.ofSeconds(60)) // 타임아웃을 60초로 설정
//                .build();
//        RedisStandaloneConfiguration serverConfig = new RedisStandaloneConfiguration("localhost", 6379);
//        return new LettuceConnectionFactory(serverConfig, clientConfig);
//    }
//
//    @Bean
//    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory connectionFactory) {
//        RedisTemplate<String, Object> template = new RedisTemplate<>();
//        template.setConnectionFactory(connectionFactory);
//        template.setKeySerializer(new StringRedisSerializer());
//        template.setValueSerializer(new StringRedisSerializer());
//        return template;
//    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // Disable CSRF for simplicity in development
                .cors(withDefaults()) // CORS 설정
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/member/join","/api/login", "/api/signup", "/swagger-ui/**", "/v3/api-docs/**", "/css/**", "/js/**").permitAll() // Permit access to certain endpoints including static resources
                        .anyRequest().authenticated()
                )

                .formLogin(form -> form
                        .loginPage("/member/login")
                        .defaultSuccessUrl("/home", true)
                        .permitAll()
                )
                .logout(logout -> logout
                        .logoutUrl("/logout")
                        .logoutSuccessUrl("/member/login")
                        .permitAll()
                );

        return http.build();
    }
}
