package Gestion_De_Reparation.App.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Gestion_De_Reparation.App.entities.DemandeReparation;
import Gestion_De_Reparation.App.service.ImpDemandeReparation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/Demande")
public class ControllerDemandeReparation {
@Autowired
ImpDemandeReparation DemandeReparation;

@PostMapping("/")
public void ajouter(@RequestBody DemandeReparation D) {
	DemandeReparation.ajouterDemandeReparation(D);
	
}
@GetMapping("/")
public List<DemandeReparation> Demandes(){

	 List<DemandeReparation> Demandes = DemandeReparation.listerDemande();
		return Demandes;
}

@GetMapping("/{numDemande}")
public ResponseEntity<DemandeReparation>chercherDemande(@PathVariable long numDemande){
DemandeReparation D=	 DemandeReparation.chercherDemandeReparation(numDemande);
if(D != null) {
	   return ResponseEntity.ok(D);
}
return null;
} 
}


