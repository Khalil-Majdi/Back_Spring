package Enicarthage.ENIbiblio.Services;

import Enicarthage.ENIbiblio.Entities.Bibliotheque.Emprunt;
import Enicarthage.ENIbiblio.Repositories.EmpruntRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmpruntService implements IEmpruntService {

    private final EmpruntRepository EmpruntRepository;
    @Override
    public Emprunt ajouterEmprunt(Emprunt b) {
        EmpruntRepository.save(b);
        return b;
    }

    @Override
    public Emprunt modifierEmprunt(Emprunt b) {
        return EmpruntRepository.save(b);

    }

    @Override
    public void supprimerEmprunt(Emprunt Emprunt) {
        EmpruntRepository.delete(Emprunt);
    }

    @Override
    public List<Emprunt> listeEmprunt() {
        List<Emprunt> liste= (List<Emprunt>) EmpruntRepository.findAll();
        return(liste);
    }

    @Override
    public List<Emprunt> listeEmpruntEtudiant(String id) {
        List<Emprunt> liste= (List<Emprunt>) EmpruntRepository.findByEtudiantEmail(id);
        return(liste);
    }




    @Override
    public Emprunt findEmpruntById(Long id) {
        Emprunt Emprunt =  EmpruntRepository.findById(id).orElse(null);
        return(Emprunt);
    }


}
