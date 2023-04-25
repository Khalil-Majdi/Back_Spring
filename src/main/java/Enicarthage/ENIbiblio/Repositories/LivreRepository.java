package Enicarthage.ENIbiblio.Repositories;

import Enicarthage.ENIbiblio.Entities.Bibliotheque.Livre;

import org.springframework.data.repository.CrudRepository;

public interface LivreRepository extends CrudRepository<Livre,Long> {
    void deleteLivreById(Long id);
}
