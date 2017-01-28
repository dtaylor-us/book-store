package com.store.bookez.configuration;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by deretayl1 on 5/2/2016.
 */
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        JdbcUserDetailsManager userDetailsService = new JdbcUserDetailsManager();
        userDetailsService.setDataSource(dataSource);
        PasswordEncoder encoder = new BCryptPasswordEncoder();

        auth.userDetailsService(userDetailsService).passwordEncoder(encoder);
        auth.jdbcAuthentication().dataSource(dataSource);


        if (!userDetailsService.userExists("user")) {
            List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
            authorities.add(new SimpleGrantedAuthority("USER"));
            User userDetails = new User("user", encoder.encode("password"), authorities);

            userDetailsService.createUser(userDetails);
        }
    }

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        //region ACCESS CONTROLL
        httpSecurity
                .authorizeRequests().antMatchers("/static/**").permitAll()
                .and()
                .authorizeRequests().antMatchers("/login**").permitAll()
                .and()
                .authorizeRequests().antMatchers("/").permitAll().anyRequest().authenticated();


        httpSecurity
                //create authentication for admin and anything with the URL=/admin/**
                .authorizeRequests().antMatchers("/admin/**").access("hasRole('ROLE_ADMIN')")
                .and()
                //.authorizeRequests().antMatchers("/customer/**").permitAll();
                .authorizeRequests().antMatchers("/customer/**").access("hasRole('ROLE_USER')");

        //endregion

        //region LOGIN
        httpSecurity
                .formLogin().loginPage("/login").loginProcessingUrl("/login.do")
                .defaultSuccessUrl("/", true)
                .failureUrl("/login?err=1")
                .usernameParameter("username").passwordParameter("password");
        //endregion

        //region ADVANCED SETTINGS
        httpSecurity.csrf().disable();
        httpSecurity.headers().frameOptions().disable();
        //endregion
    }
}
