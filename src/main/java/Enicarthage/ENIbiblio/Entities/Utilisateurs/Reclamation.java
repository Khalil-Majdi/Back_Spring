package Enicarthage.ENIbiblio.Entities.Utilisateurs;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@ToString
@EqualsAndHashCode

@Entity
public class Reclamation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    @Column(name = "emailReclamation")
    String emailReclamation;

    @Column(name = "contenu")
    String contenu;

    @ManyToOne(cascade= CascadeType.ALL,fetch=FetchType.EAGER)
    Etudiant etudiant;

    @ManyToOne(cascade= CascadeType.ALL,fetch=FetchType.EAGER)
    Administrateur administrateur;
    public Reclamation(){}

}
