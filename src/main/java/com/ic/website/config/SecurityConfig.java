
package com.ic.website.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.web.filter.ForwardedHeaderFilter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        // No HTTPS enforcement for local development
        return http.build();
    }

    @Bean
    public FilterRegistrationBean<ForwardedHeaderFilter> forwardedHeaderFilter() {
        FilterRegistrationBean<ForwardedHeaderFilter> bean = new FilterRegistrationBean<>();
        bean.setFilter(new ForwardedHeaderFilter());
        return bean;
    }
}
