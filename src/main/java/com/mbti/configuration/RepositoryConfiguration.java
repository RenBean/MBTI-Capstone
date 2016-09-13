package com.mbti.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by Ari on 9/2/16.
 */
@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.mbti.domain"})
@EnableJpaRepositories(basePackages = {"com.mbti.repositories"})
@EnableTransactionManagement
public class RepositoryConfiguration {
}