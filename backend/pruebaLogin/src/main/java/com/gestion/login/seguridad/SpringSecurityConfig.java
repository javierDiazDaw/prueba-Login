package com.gestion.login.seguridad;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;


@Configuration
@EnableWebSecurity
public class SpringSecurityConfig {



	@Bean
     SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests((authz) -> authz
                .anyRequest().authenticated()
            )
            .httpBasic(withDefaults());
        return http.build();
    }
	
}

//package com.gestion.login.seguridad;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.web.cors.CorsConfigurationSource;
//
//import com.gestion.login.cors.CorsConfig;
//
//import static org.springframework.security.config.Customizer.withDefaults;
//
//
//@Configuration
//@EnableWebSecurity
//public class SpringSecurityConfig {
//
//	
//	private final CorsConfig corsConfig;
//
//    public SpringSecurityConfig(CorsConfig corsConfig) {
//        this.corsConfig = corsConfig;
//    }
//
//
//	@Bean
//     SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//        	.cors(cors -> cors.configurationSource((CorsConfigurationSource) corsConfig.corsConfigurer()))
//            .authorizeHttpRequests((authz) -> authz
//                .anyRequest().authenticated()
//                .requestMatchers(HttpMethod.POST, "/register").permitAll()
//            )
//            .httpBasic(withDefaults())
//            
//            ;
//        
//        return http.build();
//    }
//	
//}


