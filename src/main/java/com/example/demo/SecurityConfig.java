//package com.example.demo;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfiguration {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception{
//        http.authorizeHttpRequests()
//                .anyMatchers("/h2-console/**").permitAll();
//    }
//}
