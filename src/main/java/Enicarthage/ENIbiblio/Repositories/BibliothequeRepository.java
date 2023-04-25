package Enicarthage.ENIbiblio.Repositories;

import Enicarthage.ENIbiblio.Entities.Bibliotheque.Bibliotheque;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface BibliothequeRepository extends CrudRepository<Bibliotheque,Long> {
    void deleteBibliothequeById(Long id);

}
