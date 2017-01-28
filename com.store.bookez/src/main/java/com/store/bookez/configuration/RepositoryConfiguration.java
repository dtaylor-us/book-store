package com.store.bookez.configuration;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import static org.apache.tomcat.jni.SSL.setPassword;

/**
 * Created by deretayl1 on 5/2/2016.
 */
@Configuration
@EnableAutoConfiguration
//@EnableJpaAuditing(dateTimeProviderRef = "dateTimeProvider")
@EntityScan(basePackages = {"com.store.bookez.domain"})
@EnableJpaRepositories(basePackages = {"com.store.bookez.repositories."})

public class RepositoryConfiguration {



}
