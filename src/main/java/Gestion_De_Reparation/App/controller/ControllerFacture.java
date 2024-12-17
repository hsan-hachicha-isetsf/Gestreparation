package Gestion_De_Reparation.App.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Gestion_De_Reparation.App.entities.Facture;
import Gestion_De_Reparation.App.service.ImpFactureService;

@RestController
@RequestMapping("/Facture")
public class ControllerFacture {
@Autowired
ImpFactureService ServiceFacture;
@PostMapping("/")
public void ajouter(@RequestBody Facture F) {
	ServiceFacture.ajouterFacture(F);
}
@GetMapping("/{Num_Facture}")
public ResponseEntity<Facture> chercherFacture(@PathVariable long num) {
	Facture F=ServiceFacture.chercherbyId(num);
	if(F != null) {
		   return ResponseEntity.ok(F);
	}
	return null;
	} 
}

