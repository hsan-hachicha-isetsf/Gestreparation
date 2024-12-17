package Gestion_De_Reparation.App.entities;


import java.util.ArrayList;
import java.util.Collection;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Getter
@Setter
@EqualsAndHashCode(of= {"code"})
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PieceRechange {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long code;
	private String nom;
	float prixAchat;
	float PrixHT;
	float prixTTc;
	
	@ManyToMany(mappedBy = "pieces")
	private Collection<Reparation>reparations=new ArrayList<Reparation>();
	
	@ManyToOne
	@JoinColumn(name="id_TypePiece",nullable = false)
	private TypePiece typePiece;
	

}
