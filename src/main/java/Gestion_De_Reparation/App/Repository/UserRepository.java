package Gestion_De_Reparation.App.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Gestion_De_Reparation.App.entities.User;

public interface UserRepository extends JpaRepository<User, String> {

}
