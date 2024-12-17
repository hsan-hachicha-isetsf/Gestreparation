package Gestion_De_Reparation.App.service;

import Gestion_De_Reparation.App.entities.Reparation;

public interface ImpReparation {
	
public void ajouterReparation(Reparation R);
public Reparation chercherReparation(long id);
public void surpprimerReparation(long id);
}
