package Gestion_De_Reparation.App.entities;

import java.time.LocalDate;

import org.hibernate.annotations.Check;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
@EqualsAndHashCode(of = { "numDemande" })
@AllArgsConstructor

public class DemandeReparation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numDemande;

   // @Check(constraints = "date_depot_appareil >= CURRENT_DATE")
    private LocalDate dateDepotAppareil;

   // @Check(constraints = "datePrevueReparation >= dateDepotAppareil")
    private LocalDate datePrevueReparation;

    private String etat;

    private String symptomesPanne;
   
    @JoinColumn(name = "id_client")
    @ManyToOne
    private Client client;

  
    @JoinColumn(name = "appareil_id")
    @ManyToOne
    private Appareil appareil;

    /*@OneToOne(mappedBy = "demandeReparation", cascade = CascadeType.ALL)
    private Reparation reparation;*/

    // Constructeur par défaut
    public DemandeReparation() {
        super();
    }

    // Constructeur avec tous les paramètres
    public DemandeReparation(long numDemande, LocalDate dateDepotAppareil, LocalDate datePrevueReparation, String etat,
                              String symptomesPanne) {
        this.numDemande = numDemande;
        this.dateDepotAppareil = dateDepotAppareil;
        this.datePrevueReparation = datePrevueReparation;
        this.etat = etat;
        this.symptomesPanne = symptomesPanne;
    }

    // Constructeur sans l'ID
    public DemandeReparation(LocalDate dateDepotAppareil, LocalDate datePrevueReparation, String etat,
                              String symptomesPanne) {
        this.dateDepotAppareil = dateDepotAppareil;
        this.datePrevueReparation = datePrevueReparation;
        this.etat = etat;
        this.symptomesPanne = symptomesPanne;
    }
}
