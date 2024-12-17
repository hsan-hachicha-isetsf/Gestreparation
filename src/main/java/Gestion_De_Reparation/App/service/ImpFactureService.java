package Gestion_De_Reparation.App.service;

import java.util.List;

import Gestion_De_Reparation.App.entities.Facture;

public interface ImpFactureService {
public void ajouterFacture(Facture F);
public void supprimerFacture(Facture F);
public List<Facture> chercherFacture();
public Facture chercherbyId(long id);
}
