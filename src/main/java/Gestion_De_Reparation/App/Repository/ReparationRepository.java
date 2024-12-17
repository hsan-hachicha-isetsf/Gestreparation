package Gestion_De_Reparation.App.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Gestion_De_Reparation.App.entities.Reparation;
@Repository
public interface ReparationRepository extends JpaRepository<Reparation, Long> {

}
