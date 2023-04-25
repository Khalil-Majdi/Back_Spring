package Enicarthage.ENIbiblio.Entities.Bibliotheque;

import Enicarthage.ENIbiblio.Entities.Utilisateurs.Etudiant;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Date;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter

@ToString
@EqualsAndHashCode
public class Reservation implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    Etudiant_Chaise_PK id;
    public Reservation() {
    }
    @ManyToOne
    @MapsId("chaiseId")
    @JoinColumn(name = "chaise_id")
    Chaise chaise;

    @ManyToOne
    @MapsId("etudiantId")
    @JoinColumn(name = "etudiant_id")
    Etudiant etudiant;


    Date dateReservation;
    String heureDebut;
    int nbreHeuresReservees;
}
