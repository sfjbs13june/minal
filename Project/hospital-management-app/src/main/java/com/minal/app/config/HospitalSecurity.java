package com.minal.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableWebSecurity
public class HospitalSecurity extends WebSecurityConfigurerAdapter{


    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.httpBasic().and().authorizeRequests()
                .antMatchers(HttpMethod.GET, "/doctor/doctorappointment").hasAnyRole("USER")
                .antMatchers(HttpMethod.POST, "/doctor/savedocappointment").hasAnyRole("USER")
                .antMatchers(HttpMethod.GET, "/patient/myappointment").hasAnyRole("USER")
                .antMatchers(HttpMethod.POST, "/patient/saveappointment").hasAnyRole("USER")
                .antMatchers(HttpMethod.GET, "/Prescription/viewprescription").hasAnyRole("USER")
                .antMatchers(HttpMethod.POST, "/Prescription/saveprescription").hasAnyRole("USER")
                .and().csrf().disable().headers()
                .frameOptions().disable();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("name123").password("{noop}password").roles("USER");
    }
}
