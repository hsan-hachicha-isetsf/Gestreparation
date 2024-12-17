package Gestion_De_Reparation.App.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Gestion_De_Reparation.App.Repository.FactureRepository;
import Gestion_De_Reparation.App.entities.Facture;

@Service
public class FactureService implements ImpFactureService {
	@Autowired
	FactureRepository repository;

	@Override
	public void ajouterFacture(Facture factureToCreate) {
		
		
		factureToCreate.setMontantTotal(calculateTotal(factureToCreate));
		
		// TODO Auto-generated method stub
		repository.save(factureToCreate);
	}
	
	
	private float calculateTotal(Facture facture) {
		return facture.getReparation().getTempsMO() * facture.getReparation().getTarifHMO();
	}
	

	@Override
	public void supprimerFacture(Facture F) {
		// TODO Auto-generated method stub
		repository.delete(F);
	}

	@Override
	public List<Facture> chercherFacture() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Facture chercherbyId(long id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);

	}
}
