package Gestion_De_Reparation.App.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Gestion_De_Reparation.App.entities.Client;
import Gestion_De_Reparation.App.service.ImpClientService;



@RestController
@RequestMapping("/Clients")
//@CrossOrigin(origins = "http://localhost:5173")
public class ControllerClient {
	@Autowired
	ImpClientService clientService;
	@PostMapping("/")
	public void AjouterClient(@RequestBody Client C) {
		clientService.ajouterClient(C);
	}
	@GetMapping("/delete/{id}")
	public void deleteClient(@PathVariable long id) {
		clientService.supprimerClient(id);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Client> chercherClient(@PathVariable long id) {
	Client client = clientService.chercherClientById(id);
	if(client != null) {
		   return ResponseEntity.ok(client);
	}
	return null;
	} 
	@GetMapping("/")
	public List<Client> Clients(){
	
		 List<Client> clients = clientService.Clients();
			return clients;
	}
	/*@PutMapping("/{id}")
    public ResponseEntity<Object> updateClient(@PathVariable Long id, @RequestBody Client client) {
        return ResponseEntity.ok(clientService.updateClient(id, client));
    }*/
	}
	
	


