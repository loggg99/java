package com.example.tobi.springbootessential.Config;


import com.example.tobi.springbootessential.Filter.LoggingFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<LoggingFilter> filterRegistrationBean() {
        FilterRegistrationBean registration = new FilterRegistrationBean();

        registration.setFilter(new LoggingFilter());
        registration.addUrlPatterns("/api/*");
        registration.setOrder(1);

        return registration;

    }
}
