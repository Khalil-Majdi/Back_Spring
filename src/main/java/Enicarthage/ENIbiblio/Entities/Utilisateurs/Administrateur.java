package Enicarthage.ENIbiblio.Entities.Utilisateurs;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
public class Administrateur extends Utilisateur {

    private static final long serialVersionUID = 1L;

    @OneToMany(cascade = CascadeType.ALL)
    List<Reclamation> reclamations;

    public Administrateur() {
        // TODO Auto-generated constructor stub
    }


}
