package org.audit_logging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Точка старта модуля
 */
@SpringBootApplication
public class AuditLoggingApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuditLoggingApplication.class, args);
    }
}
