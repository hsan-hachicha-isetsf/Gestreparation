package Gestion_De_Reparation.App.entities;






import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

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
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = { "appareilId" })
public class Appareil {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "appareil_id")
	private Long appareilId;
	private String marque;
	private String modele;
	private String numeroSerie;


}
