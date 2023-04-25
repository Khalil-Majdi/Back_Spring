package Enicarthage.ENIbiblio.Services;

import Enicarthage.ENIbiblio.Entities.Bibliotheque.Livre;
import Enicarthage.ENIbiblio.Repositories.LivreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LivreService implements ILivreService {

    private final LivreRepository LivreRepository;
    @Override
    public Livre ajouterLivre(Livre b) {
        LivreRepository.save(b);
        return b;
    }

    @Override
    public Livre modifierLivre(Livre b) {
        return LivreRepository.save(b);

    }

    @Override
    public void supprimerLivre(Livre Livre) {
        LivreRepository.delete(Livre);
    }

    @Override
    public List<Livre> listeLivre() {
        List<Livre> liste= (List<Livre>) LivreRepository.findAll();
        return(liste);
    }

    @Override
    public Livre findLivreById(Long id) {
        Livre Livre =  LivreRepository.findById(id).orElse(null);
        return(Livre);
    }

}
