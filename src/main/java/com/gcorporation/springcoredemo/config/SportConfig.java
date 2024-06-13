package com.gcorporation.springcoredemo.config;

import com.gcorporation.springcoredemo.common.Coach;
import com.gcorporation.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class SportConfig {
    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
