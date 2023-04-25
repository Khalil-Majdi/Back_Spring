package Enicarthage.ENIbiblio.Services;

import Enicarthage.ENIbiblio.Entities.Bibliotheque.Chaise;

import java.util.List;

public interface IChaiseService {
    public Chaise ajouterChaise(Chaise b);
    public Chaise modifierChaise(Chaise b);
    public void supprimerChaise(Chaise Chaise);
    public List<Chaise> listeChaise();
    public Chaise findChaiseById(Long id) ;
}
