package org.gunsugunaydin.AirlineManagement.repository;

import org.gunsugunaydin.AirlineManagement.model.Airplane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirplaneRepository extends JpaRepository<Airplane, Long> {

    boolean existsByTailNumber(String tailNumber);
}