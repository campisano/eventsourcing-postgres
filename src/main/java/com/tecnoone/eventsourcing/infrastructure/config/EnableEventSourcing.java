package com.tecnoone.eventsourcing.infrastructure.config;

import com.tecnoone.eventsourcing.EventSourcingConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import({EventSourcingConfig.class})
public @interface EnableEventSourcing {

}