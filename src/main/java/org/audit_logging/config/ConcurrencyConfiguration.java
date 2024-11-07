package org.audit_logging.config;

import org.audit_logging.aspect.ExceptionHandlingAspect;
import org.audit_logging.aspect.LoggableAspect;
import org.audit_logging.listener.CustomListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Класс конфигураций по созданию бинов
 */
@Configuration
public class ConcurrencyConfiguration {

    @Bean
    public CustomListener customListener() {
        return new CustomListener();
    }

    @Bean
    public LoggableAspect loggableAspect(){
        return new LoggableAspect();
    }

    @Bean
    public ExceptionHandlingAspect exceptionHandlingAspect(){
        return new ExceptionHandlingAspect();
    }
}
