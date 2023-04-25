package Enicarthage.ENIbiblio.Services;

import Enicarthage.ENIbiblio.Entities.Bibliotheque.Bibliotheque;
import Enicarthage.ENIbiblio.Entities.Bibliotheque.Livre;
import Enicarthage.ENIbiblio.Repositories.BibliothequeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BibliothequeService implements IBibliothequeService {

    private final BibliothequeRepository bibliothequeRepository;
    @Override
    public Bibliotheque ajouterBibliotheque(Bibliotheque b) {
        bibliothequeRepository.save(b);
        return b;
    }

    @Override
    public Bibliotheque modifierBibliotheque(Bibliotheque b) {
        return bibliothequeRepository.save(b);

    }

    @Override
    public void supprimerBibliotheque(Bibliotheque bibliotheque) {
        bibliothequeRepository.delete(bibliotheque);
    }

    @Override
    public List<Bibliotheque> listeBibliotheque() {
        List<Bibliotheque> liste= (List<Bibliotheque>) bibliothequeRepository.findAll();
        return(liste);
    }
    @Override
    public List<Livre> listeLivreBibliotheque(Long id) {
        Bibliotheque bibliotheque=bibliothequeRepository.findById(id).orElse(null);
        return bibliotheque.getLivres();
        //List<Livre> liste= (List<Livre>) bibliothequeRepository.findById(id).livre;
        //return(liste);
    }
    @Override
    public Bibliotheque findBibliothequeById(Long id) {
        Bibliotheque bibliotheque =  bibliothequeRepository.findById(id).orElse(null);
        return(bibliotheque);
    }

}
