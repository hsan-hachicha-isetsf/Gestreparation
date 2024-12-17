package Gestion_De_Reparation.App.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@EqualsAndHashCode(of= {"NumFacture"})
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Facture {
	@Id
	Long NumFacture;
	Date dateFac;
	float montantTotal;
	
	 @OneToOne
	    @JoinColumn(name = "reparation_id", nullable = false)
	    private Reparation reparation;
	

	

}
