package com.ylc.kuaishou.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Getter
//@Setter
@Configuration
@ConditionalOnProperty(
        prefix = "kuaishou",
        name = "isOpen",
        havingValue = "true"
)
@ComponentScan("com.ylc.kuaishou")
public class BeanConfig {

    @Bean
    @ConfigurationProperties(prefix = "kuaishou")
    public KuaiShouInfo kuaiShouInfo(){
        return new KuaiShouInfo();
    }
}
