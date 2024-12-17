package Gestion_De_Reparation.App.service;

import java.util.List;

import Gestion_De_Reparation.App.entities.Client;

public interface ImpClientService {
	public void ajouterClient(Client C);

	public void ModifierClient(Client C);


	public Client chercherClientById(long id);
	public void supprimerClient(long id);
	public List<Client> Clients();

	//public Object updateClient(Long id, Client client);
}
