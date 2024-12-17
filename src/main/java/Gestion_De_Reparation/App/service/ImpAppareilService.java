package Gestion_De_Reparation.App.service;

import java.util.List;

import Gestion_De_Reparation.App.entities.Appareil;

public interface ImpAppareilService {
	public Appareil ajouterAppareil(Appareil A);

	public void SupprimerAppareil(long id);

	public Appareil chercherAppareil(long id);

	public List<Appareil> listerAppareil();

}
