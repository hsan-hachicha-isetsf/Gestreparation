package Gestion_De_Reparation.App.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Gestion_De_Reparation.App.entities.Appareil;

public interface AppareilRepository extends JpaRepository<Appareil, Long> {

}
