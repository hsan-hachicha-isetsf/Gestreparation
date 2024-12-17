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

import Gestion_De_Reparation.App.entities.Appareil;

import Gestion_De_Reparation.App.service.ImpAppareilService;

@RestController
@RequestMapping("/App")
public class ControllerAppareil {
	@Autowired
	ImpAppareilService appreilServiceImpl;

	@PostMapping("/")
	public void ajouterAppreil(@RequestBody Appareil appareil) {

		appreilServiceImpl.ajouterAppareil(appareil);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Appareil> chercherClient(@PathVariable long id) {
		Appareil client = appreilServiceImpl.chercherAppareil(id);
		if (client != null) {
			return ResponseEntity.ok(client);
		}
		return null;
	}

	@GetMapping("/")
	public List<Appareil> Appareils() {

		List<Appareil> App = appreilServiceImpl.listerAppareil();
		return App;
	}
}
