package Gestion_De_Reparation.App.entities;

import java.util.ArrayList;
import java.util.Collection;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@EqualsAndHashCode(of = { "id_TypePiece" })
@ToString
@AllArgsConstructor
public class TypePiece {
	@Id
	String id_TypePiece;

	float tarifH;
	String type;

	public TypePiece(float tarifH, String type) {
		super();
		this.tarifH = tarifH;
		this.type = type;
	}

	public TypePiece() {
		super();
	}

	@OnDelete(action = OnDeleteAction.CASCADE)
	@OneToMany(mappedBy = "typePiece", cascade = CascadeType.ALL)
	private Collection<PieceRechange> Pieces = new ArrayList<PieceRechange>();
}
