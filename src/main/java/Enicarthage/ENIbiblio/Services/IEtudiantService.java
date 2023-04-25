package Enicarthage.ENIbiblio.Services;

import Enicarthage.ENIbiblio.Entities.Utilisateurs.Etudiant;

import java.util.List;

public interface IEtudiantService {

    public Etudiant ajouterEtudiant(Etudiant b) ;


    public Etudiant modifierEtudiant(Etudiant b);



    public void supprimerEtudiant(Etudiant etudiant) ;


    public List<Etudiant> listeEtudiant() ;


    public Etudiant findEtudiantById(String id) ;

    // reclamer (ajouter une reclamation)
}
