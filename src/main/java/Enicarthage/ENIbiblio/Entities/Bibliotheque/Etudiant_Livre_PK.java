package Enicarthage.ENIbiblio.Entities.Bibliotheque;

import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Objects;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Embeddable
public class Etudiant_Livre_PK implements Serializable {
    private static final long serialVersionUID=1L;

    Long id;
    String email;


    public Etudiant_Livre_PK(Long id,String email){
        this.id=id;
        this.email=email;
    }

    public Etudiant_Livre_PK() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Etudiant_Livre_PK)) return false;
        Etudiant_Livre_PK otherObject = (Etudiant_Livre_PK) o;
        return Objects.equals(otherObject.id,this.id) &&
                Objects.equals(otherObject.email,this.email );
    }

    @Override
    public int hashCode() {

        return Objects.hash(email, id);
    }




}
