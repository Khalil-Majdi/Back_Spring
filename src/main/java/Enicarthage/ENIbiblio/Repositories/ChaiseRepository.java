package Enicarthage.ENIbiblio.Repositories;

import Enicarthage.ENIbiblio.Entities.Bibliotheque.Chaise;

import org.springframework.data.repository.CrudRepository;

public interface ChaiseRepository extends CrudRepository<Chaise,Long> {
    void deleteChaiseById(Long id);
}
