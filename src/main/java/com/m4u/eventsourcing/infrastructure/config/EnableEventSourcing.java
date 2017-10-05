package com.m4u.eventsourcing.infrastructure.config;

import com.m4u.eventsourcing.EventSourcingConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import({EventSourcingConfig.class})
public @interface EnableEventSourcing {

}