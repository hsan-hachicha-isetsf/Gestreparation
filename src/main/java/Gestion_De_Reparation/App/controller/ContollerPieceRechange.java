package Gestion_De_Reparation.App.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Gestion_De_Reparation.App.entities.PieceRechange;
import Gestion_De_Reparation.App.service.ImpPieceRechangeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/Piece")
public class ContollerPieceRechange {
	@Autowired
	ImpPieceRechangeService service;

	@GetMapping("/{num_piece}")
	public ResponseEntity<PieceRechange> chercher(@PathVariable long num) {
		PieceRechange P = service.chercherPiece(num);
		if (P != null) {
			return ResponseEntity.ok(P);
		}
		return (null);
	}

	@PutMapping("/update/")
	public String Update(@RequestBody PieceRechange P) {
		service.Modifier(P);
		return ("Modifier avec succes");
	}

	@PostMapping("/")
	public void ajouterPiece(@RequestBody PieceRechange P) {
		service.ajouterPiece(P);

	}
}
