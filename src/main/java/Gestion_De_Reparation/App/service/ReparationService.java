package Gestion_De_Reparation.App.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Gestion_De_Reparation.App.Repository.ReparationRepository;

import Gestion_De_Reparation.App.entities.Reparation;
@Service
public class ReparationService implements ImpReparation {
@Autowired
ReparationRepository repositoy;
	@Override
	public void ajouterReparation(Reparation R) {
		repositoy.save(R);
		
	}

	@Override
	public Reparation chercherReparation(long id) {
		// TODO Auto-generated method stub
		return repositoy.findById(id).get();
	}

	@Override
	public void surpprimerReparation(long id) {
		// TODO Auto-generated method stub
	repositoy.deleteById(id);
		
	}


	

}
