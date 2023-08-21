package com.ajtsistemas.syscare.services.impl;

import com.ajtsistemas.syscare.domain.models.Scheduling;
import com.ajtsistemas.syscare.repositories.SchedulingRepository;
import com.ajtsistemas.syscare.services.SchedulingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SchedulingServiceImpl implements SchedulingService {
    private final SchedulingRepository schedulingRepository;

    @Override
    public Scheduling create(Scheduling scheduling) {
        return null;
    }

    @Override
    public Scheduling update(String action, Long schedulingId) {
        return null;
    }
}
