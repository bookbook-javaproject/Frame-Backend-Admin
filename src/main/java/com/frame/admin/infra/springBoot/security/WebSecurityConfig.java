package com.frame.admin.infra.springBoot.security;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    private final JwtProvider jwtProvider;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .sessionManagement().disable()
                .formLogin().disable()
                .authorizeRequests()
                .antMatchers(HttpMethod.POST, "/admin").permitAll()
                .antMatchers(HttpMethod.POST, "/admin/auth").permitAll()
                .anyRequest().authenticated()
                .and()
                .apply(new JwtConfigure(jwtProvider));
    }
}
