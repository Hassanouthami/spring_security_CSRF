package com.example.ssCSRF.config;

import com.example.ssCSRF.security.CustomCSRFRepository;
import com.example.ssCSRF.security.filter.CustomCSRFFilter;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CsrfFilter;

@Configuration
public class ProjectConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        super.configure(http);
        //http.csrf().disable();don't do that
        http.csrf(c->{
            c.ignoringAntMatchers("/ignore/**");
     //       c.csrfTokenRepository(new CustomCSRFRepository());
            http.addFilterAfter(new CustomCSRFFilter(), CsrfFilter.class);
        });
    }
}
