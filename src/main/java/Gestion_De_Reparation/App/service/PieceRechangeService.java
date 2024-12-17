package Gestion_De_Reparation.App.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Gestion_De_Reparation.App.Repository.PieceRechangeRepository;
import Gestion_De_Reparation.App.entities.PieceRechange;
@Service
public class PieceRechangeService implements ImpPieceRechangeService {
@Autowired
PieceRechangeRepository repository;
	@Override
	public void ajouterPiece(PieceRechange P) {
repository.save(P);
	}

	@Override
	public void SupprimerPiece(long id) {
repository.deleteById(id);
	}

	@Override
	public List<PieceRechange> listerPiece() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public PieceRechange chercherPiece(long num_piece) {
		// TODO Auto-generated method stub
	return	repository.findById(num_piece).orElse(null);
	}

	@Override
	public void Modifier(PieceRechange P) {
		repository.save(P);
		
	}

}
