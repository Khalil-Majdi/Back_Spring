package Enicarthage.ENIbiblio.Services;

import Enicarthage.ENIbiblio.Entities.Utilisateurs.Administrateur;


import java.util.List;

public interface IAdministrateurService {
    public Administrateur ajouterAdministrateur(Administrateur b) ;
    public Administrateur modifierAdministrateur(Administrateur b);
    public void supprimerAdministrateur(Administrateur administrateur);
    public List<Administrateur> listeAdministrateur() ;
    public Administrateur findAdministrateurById(String id);
    // reclamer (ajouter une reclamation)
}
