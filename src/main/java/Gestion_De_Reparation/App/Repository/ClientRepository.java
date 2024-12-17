package Gestion_De_Reparation.App.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Gestion_De_Reparation.App.entities.Client;
@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
