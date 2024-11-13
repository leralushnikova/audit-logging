package org.audit_logging.annotations;

import org.audit_logging.config.ConcurrencyConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** Аннотация включения данного модуля */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({ConcurrencyConfiguration.class})
public @interface EnableAuditLogging {
}