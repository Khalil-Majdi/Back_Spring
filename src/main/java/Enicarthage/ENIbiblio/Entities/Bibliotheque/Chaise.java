package Enicarthage.ENIbiblio.Entities.Bibliotheque;

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
public class Chaise implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long id;
    boolean dispo;
    public Chaise(){};
    @OneToMany(mappedBy="chaise")
    List<Reservation> reservations;
}
