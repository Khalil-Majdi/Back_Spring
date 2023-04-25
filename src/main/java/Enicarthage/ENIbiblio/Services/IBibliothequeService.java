package Enicarthage.ENIbiblio.Services;

import Enicarthage.ENIbiblio.Entities.Bibliotheque.Bibliotheque;
import Enicarthage.ENIbiblio.Entities.Bibliotheque.Livre;

import java.util.List;

public interface IBibliothequeService {
    public Bibliotheque ajouterBibliotheque(Bibliotheque b);
    public Bibliotheque modifierBibliotheque(Bibliotheque b);
    public void supprimerBibliotheque(Bibliotheque bibliotheque);
    public List<Bibliotheque> listeBibliotheque();
    public List<Livre> listeLivreBibliotheque(Long id);
    public Bibliotheque findBibliothequeById(Long id) ;

}
