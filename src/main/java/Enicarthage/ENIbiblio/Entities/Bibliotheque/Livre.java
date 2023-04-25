package Enicarthage.ENIbiblio.Entities.Bibliotheque;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.List;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter


@EqualsAndHashCode
public class Livre implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nomDuLivre;
    String nomAuteur;
    String theme;
    String description;
    String urlImage;
    boolean is_emprunt;

    @OneToMany(mappedBy="livre",cascade=CascadeType.ALL,orphanRemoval = true)
    @JsonIgnore
    List<Emprunt> emprunts;

    public Livre(){ }

    @Override
    public String toString() {
        return "Livre{" +
                "id=" + id +
                ", nomDuLivre='" + nomDuLivre + '\'' +
                ", nomAuteur='" + nomAuteur + '\'' +
                ", theme='" + theme + '\'' +
                ", description='" + description + '\'' +
                ", urlImage='" + urlImage + '\'' +
                ", is_emprunt=" + is_emprunt +
                '}';
    }


}
