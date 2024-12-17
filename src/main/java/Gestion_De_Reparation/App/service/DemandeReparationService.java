package Gestion_De_Reparation.App.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Gestion_De_Reparation.App.Repository.DemandeReparationRepository;
import Gestion_De_Reparation.App.entities.DemandeReparation;

@Service
public class DemandeReparationService implements ImpDemandeReparation {
	@Autowired
	public DemandeReparationRepository repository;

	@Override
	public void ajouterDemandeReparation(DemandeReparation D) {
		repository.save(D);

	}

	@Override
	public DemandeReparation chercherDemandeReparation(long id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	public void SupprimerDemandeReparation(long id) {
		repository.deleteById(id);

	}

	@Override
	public List<DemandeReparation> listerDemande() {
		
		return repository.findAll();
	}
}
