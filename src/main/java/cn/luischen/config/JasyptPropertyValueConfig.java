package cn.luischen.config;

import org.springframework.beans.factory.config.PropertyOverrideConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JasyptPropertyValueConfig {

    @Bean
    public PropertyOverrideConfigurer jasyptPropertyOverrideConfigurer() {
        return new JasyptPropertyValueHandler();
    }
}
