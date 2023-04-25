package Enicarthage.ENIbiblio.Entities.Utilisateurs;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode

@Entity
@Table(name="T_UTILISATEUR")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public abstract class Utilisateur implements Serializable {
    private static final long serialVersionUID = 1L;
    public Utilisateur() {
        // TODO Auto-generated constructor stub
    }


    @Id

    @Column(name = "email")
    String email;
    @Column(name = "nom")
    String nom;
    @Column(name = "prenom")
    String prenom;
    @Column(name = "motDePasse")
    String motDePasse;
}