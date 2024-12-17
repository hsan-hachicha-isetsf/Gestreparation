package Gestion_De_Reparation.App.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Gestion_De_Reparation.App.Repository.ClientRepository;
import Gestion_De_Reparation.App.entities.Client;
@Service

public class ClientService implements ImpClientService {
	@Autowired
	private ClientRepository clientRepository;

	@Override
	public void ajouterClient(Client C) {
		clientRepository.save(C);

	}

	@Override
	public void ModifierClient(Client C) {
		clientRepository.save(C);

	}

	@Override
	public Client chercherClientById(long id) {
		return clientRepository.findById(id).orElse(null);
	}

	@Override
	public void supprimerClient(long id) {
		clientRepository.deleteById(id);
		
	}

	/*@Override
	public Object updateClient(Long id, Client client) {
		// TODO Auto-generated method stub
		return null;
	}
*/
	@Override
	public List<Client> Clients() {
	return	clientRepository.findAll();
		
	}

	

	/*@Override
	public Object updateClient(Long id, Client client) {
		// TODO Auto-generated method stub
		return null;
	}*/

}
