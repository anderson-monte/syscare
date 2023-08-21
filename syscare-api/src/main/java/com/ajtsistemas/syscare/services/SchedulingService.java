package com.ajtsistemas.syscare.services;

import com.ajtsistemas.syscare.domain.models.Scheduling;

public interface SchedulingService {
    Scheduling create(Scheduling scheduling);
    Scheduling update(String action, Long schedulingId);

}
