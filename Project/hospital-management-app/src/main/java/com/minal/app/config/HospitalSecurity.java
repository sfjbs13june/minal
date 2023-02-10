package com.minal.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
public class HospitalSecurity extends WebSecurityConfigurerAdapter{


    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.httpBasic().and().authorizeRequests()
                .antMatchers("/swagger-ui/indecx.html").hasAnyRole("DOC1","PATIENT123")
                .antMatchers(HttpMethod.GET, "/doctor/doctorappointment").hasAnyRole("DOC1")
                .antMatchers(HttpMethod.POST, "/doctor/savedocappointment").hasAnyRole("DOC1")
                .antMatchers(HttpMethod.GET, "/patient/myappointment").hasAnyRole("PATIENT123")
                .antMatchers(HttpMethod.POST, "/patient/savepatientappointment").hasAnyRole("PATIENT123")
                .antMatchers(HttpMethod.GET, "/Prescription/viewprescription").hasAnyRole("PATIENT123","DOC1")
                .antMatchers(HttpMethod.POST, "/Prescription/saveprescription").hasAnyRole("PATIENT123","DOC1")
                .and().csrf().disable().headers()
                .frameOptions().disable();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("doc1").password("{noop}password").roles("DOC1").and().withUser("pat1").password("{noop}password").roles("PATIENT123");
    }
}
