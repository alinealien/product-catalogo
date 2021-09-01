package com.digitalinnovation.experts.productcatalogo.config;

import org.springframework.context.annotation.Bean;

public interface ElasticSearchConfiguration {
    @Bean
    ElasticSearchEntityMapper entityMapper();
}
