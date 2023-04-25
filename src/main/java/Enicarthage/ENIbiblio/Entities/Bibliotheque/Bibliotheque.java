package Enicarthage.ENIbiblio.Entities.Bibliotheque;

import Enicarthage.ENIbiblio.Entities.Utilisateurs.Administrateur;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.List;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Bibliotheque implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String etablissement;
    int nbrDePlaceOccupees;
    int nbrDeChaises;
    String email;
    String numTel;


    @OneToMany(cascade = CascadeType.ALL)
    List<Chaise> chaises;

    @OneToMany(cascade = CascadeType.ALL)
    List<Livre> livres;
    @OneToMany(cascade = CascadeType.ALL)
    List <Administrateur> administrateurs;
}