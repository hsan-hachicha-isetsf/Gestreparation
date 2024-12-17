package Gestion_De_Reparation.App.service;

import java.util.List;

import Gestion_De_Reparation.App.entities.DemandeReparation;

public interface ImpDemandeReparation {
	public void ajouterDemandeReparation(DemandeReparation D);
	public DemandeReparation chercherDemandeReparation(long id);
	public void SupprimerDemandeReparation(long id);
	public List<DemandeReparation> listerDemande();
}
