package Gestion_De_Reparation.App.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Gestion_De_Reparation.App.entities.TypePiece;
@Repository
public interface TypePieceRepository extends JpaRepository<TypePiece, String> {

}
