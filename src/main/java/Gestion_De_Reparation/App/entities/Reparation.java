package Gestion_De_Reparation.App.entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@EqualsAndHashCode(of = { "id_Reparation" })
@AllArgsConstructor
@NoArgsConstructor
public class Reparation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id_Reparation;
	private String description;
	private Date dateRep;

	float tarifHMO;
	private float tempsMO;
	@OneToOne
	private DemandeReparation demandeReparation;

	@ManyToMany
	@JoinTable(name = "reparation_piece_rechange", joinColumns = @JoinColumn(name = "reparation_id"), inverseJoinColumns = @JoinColumn(name = "piece_id"))
	private Collection<PieceRechange> pieces = new ArrayList<PieceRechange>();


}
