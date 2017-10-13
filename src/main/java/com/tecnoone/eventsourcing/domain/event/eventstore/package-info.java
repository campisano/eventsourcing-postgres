/**
 * Created by raphael on 10/11/16.
 * Aggregates da camada de dominio
 */
@TypeDefs({@TypeDef(name = "jsonObject", typeClass = JsonUserType.class)})
package com.tecnoone.eventsourcing.domain.event.eventstore;

import com.tecnoone.eventsourcing.infrastructure.hibernate.JsonUserType;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;