package Enicarthage.ENIbiblio.Services;

import Enicarthage.ENIbiblio.Entities.Bibliotheque.Chaise;
import Enicarthage.ENIbiblio.Repositories.ChaiseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChaiseService implements IChaiseService {

    private final ChaiseRepository ChaiseRepository;
    @Override
    public Chaise ajouterChaise(Chaise b) {
        ChaiseRepository.save(b);
        return b;
    }

    @Override
    public Chaise modifierChaise(Chaise b) {
        return ChaiseRepository.save(b);

    }

    @Override
    public void supprimerChaise(Chaise Chaise) {
        ChaiseRepository.delete(Chaise);
    }

    @Override
    public List<Chaise> listeChaise() {
        List<Chaise> liste= (List<Chaise>) ChaiseRepository.findAll();
        return(liste);
    }

    @Override
    public Chaise findChaiseById(Long id) {
        Chaise Chaise =  ChaiseRepository.findById(id).orElse(null);
        return(Chaise);
    }

}
