package com.wonit;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(UserProperty.class)
@ConditionalOnClass(Greeter.class)
public class GreeterAutoConfiguration {

    private UserProperty userProperty;

    public GreeterAutoConfiguration(UserProperty userProperty) {
        this.userProperty = userProperty;
    }

    @Bean
    @ConditionalOnMissingBean
    public Greeter greeter() {
        return new Greeter(userProperty.getName(), userProperty.getAge());
    }

}