package Enicarthage.ENIbiblio.Repositories;

import Enicarthage.ENIbiblio.Entities.Utilisateurs.Etudiant;
import org.springframework.data.repository.CrudRepository;

public interface EtudiantRepository extends CrudRepository<Etudiant,String> {
        void deleteEtudiantByEmail(String email);

        }