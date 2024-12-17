package Gestion_De_Reparation.App.service;

import java.util.List;

import Gestion_De_Reparation.App.entities.PieceRechange;

public interface ImpPieceRechangeService {
	public void ajouterPiece(PieceRechange P);
	public void SupprimerPiece(long id);
	public List<PieceRechange> listerPiece();
public PieceRechange chercherPiece(long num_piece);
public void Modifier(PieceRechange P);
}
