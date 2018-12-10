package com.adidas.sub.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.auth.BasicAuthRequestInterceptor;

@Configuration
@EnableConfigurationProperties
public class ClientConfiguration {

  @Value("${security.basicAuth.username}")
  private String basicAuthUsername;

  @Value("${security.basicAuth.password}")
  private String basicAuthPassword;

  @Bean
  @ConditionalOnProperty(name = "security.basicAuth.username")
  public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
    return new BasicAuthRequestInterceptor(this.basicAuthUsername, this.basicAuthPassword);
  }

}
