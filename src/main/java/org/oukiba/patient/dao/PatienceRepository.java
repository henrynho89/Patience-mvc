package org.oukiba.patient.dao;

import org.oukiba.patient.entities.Patience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatienceRepository extends JpaRepository<Patience, Long>{

}
