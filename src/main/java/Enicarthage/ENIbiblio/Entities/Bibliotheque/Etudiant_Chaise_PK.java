package Enicarthage.ENIbiblio.Entities.Bibliotheque;

import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Embeddable
public class Etudiant_Chaise_PK implements Serializable {
    private static final long serialVersionUID=1L;

    int id;
    String email;


}