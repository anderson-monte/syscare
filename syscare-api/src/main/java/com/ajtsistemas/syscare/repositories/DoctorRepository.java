package com.ajtsistemas.syscare.repositories;

import com.ajtsistemas.syscare.domain.models.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
