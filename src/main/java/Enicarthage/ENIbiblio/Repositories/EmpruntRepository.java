package Enicarthage.ENIbiblio.Repositories;

import Enicarthage.ENIbiblio.Entities.Bibliotheque.Emprunt;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmpruntRepository extends CrudRepository<Emprunt,Long> {
    List<Emprunt> findByEtudiantEmail(String email);
}
