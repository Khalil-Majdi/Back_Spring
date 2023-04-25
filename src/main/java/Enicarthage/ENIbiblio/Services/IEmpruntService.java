package Enicarthage.ENIbiblio.Services;

import Enicarthage.ENIbiblio.Entities.Bibliotheque.Emprunt;

import java.util.List;

public interface IEmpruntService {
        public Emprunt ajouterEmprunt(Emprunt b);
        public Emprunt modifierEmprunt(Emprunt b);
        public void supprimerEmprunt(Emprunt Emprunt);
        public List<Emprunt> listeEmprunt();
        public List<Emprunt> listeEmpruntEtudiant(String id);
        public Emprunt findEmpruntById(Long id) ;
}
