package Enicarthage.ENIbiblio.Services;

import Enicarthage.ENIbiblio.Entities.Bibliotheque.Livre;

import java.util.List;

public interface ILivreService {
    public Livre ajouterLivre(Livre b);
    public Livre modifierLivre(Livre b);
    public void supprimerLivre(Livre Livre);
    public List<Livre> listeLivre();
    public Livre findLivreById(Long id) ;
}
