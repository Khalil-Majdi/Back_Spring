package Enicarthage.ENIbiblio.Entities.Utilisateurs;

import Enicarthage.ENIbiblio.Entities.Bibliotheque.Emprunt;
import Enicarthage.ENIbiblio.Entities.Bibliotheque.Reservation;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@ToString
@EqualsAndHashCode

@Entity
public class Etudiant extends Utilisateur{




    @OneToMany(cascade = CascadeType.ALL)
    List<Reclamation> reclamations;

    @OneToMany(mappedBy="etudiant")
    @JsonIgnore
    List <Emprunt> emprunts;

    @OneToMany()
    List <Reservation> reservations;


    public Etudiant() {
    }
    public Etudiant(String email,String nom,String prenom,String motDePasse) {
        super(email, nom, prenom,motDePasse);




    }
}
