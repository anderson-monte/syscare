package com.ajtsistemas.syscare.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HealthCenter extends JpaRepository<HealthCenter, Long> {
}
