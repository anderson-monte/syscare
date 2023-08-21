package com.ajtsistemas.syscare.repositories;

import com.ajtsistemas.syscare.domain.models.Scheduling;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchedulingRepository extends JpaRepository<Scheduling, Long> {
}
