package Enicarthage.ENIbiblio.Repositories;

import Enicarthage.ENIbiblio.Entities.Utilisateurs.Administrateur;
import Enicarthage.ENIbiblio.Entities.Utilisateurs.Etudiant;
import org.springframework.data.repository.CrudRepository;

public interface AdministrateurRepository extends CrudRepository<Administrateur,String> {
    void deleteAdministrateurByEmail(String email);
}