package com.code.ylc.module.crm.framework.web.config;

import com.code.ylc.framework.swagger.config.YlcSwaggerAutoConfiguration;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * crm 模块的 web 组件的 Configuration
 *
 * @author 芋道源码
 */
@Configuration(proxyBeanMethods = false)
public class CrmWebConfiguration {

    /**
     * crm 模块的 API 分组
     */
    @Bean
    public GroupedOpenApi crmGroupedOpenApi() {
        return YlcSwaggerAutoConfiguration.buildGroupedOpenApi("crm");
    }

}
