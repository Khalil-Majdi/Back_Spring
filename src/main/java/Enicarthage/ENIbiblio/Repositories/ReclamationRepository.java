package Enicarthage.ENIbiblio.Repositories;

import Enicarthage.ENIbiblio.Entities.Utilisateurs.Reclamation;
import org.springframework.data.repository.CrudRepository;

public interface ReclamationRepository extends CrudRepository<Reclamation,Long> {
        void deleteReclamationById(Long id);
        }
