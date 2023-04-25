package Enicarthage.ENIbiblio.Entities.Bibliotheque;

import Enicarthage.ENIbiblio.Entities.Utilisateurs.Etudiant;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Date;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter


@EqualsAndHashCode
public class Emprunt implements Serializable {
    private static final long serialVersionUID = 1L;
/*
    @EmbeddedId
    Etudiant_Livre_PK etudiant_livre_pk ;
    */
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 int id_emprunt;
    public Emprunt(){}


    @ManyToOne
    @JoinColumn(name = "id")

    Livre livre;

    @ManyToOne

    @JoinColumn(name = "email")
    Etudiant etudiant;

    Date dateDebut;
    Date dateFin;


}