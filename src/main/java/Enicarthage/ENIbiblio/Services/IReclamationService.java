package Enicarthage.ENIbiblio.Services;

import Enicarthage.ENIbiblio.Entities.Utilisateurs.Reclamation;

import java.util.List;

public interface IReclamationService {
    Reclamation ajouterReclamation(Reclamation b);
    Reclamation modifierReclamation(Reclamation b);
    void supprimerReclamation(Long id);
    List<Reclamation> listeReclamation();
}
