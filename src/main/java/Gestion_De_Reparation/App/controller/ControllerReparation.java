package Gestion_De_Reparation.App.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import Gestion_De_Reparation.App.entities.Reparation;
import Gestion_De_Reparation.App.service.ImpReparation;
@RestController
@RequestMapping("/Reparation")
public class ControllerReparation {
	@Autowired
	ImpReparation Reparation;
	@PostMapping("/")	
	public void ajouterReparation(@RequestBody Reparation R) {
		Reparation.ajouterReparation(R);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Reparation> chercherClient(@PathVariable long id) {
	Reparation R1 = Reparation.chercherReparation(id);
	if(R1 != null) {
		   return ResponseEntity.ok(R1);
	}
	return null;
	} 

}
