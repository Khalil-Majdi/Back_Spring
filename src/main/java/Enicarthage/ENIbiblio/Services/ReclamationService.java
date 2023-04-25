package Enicarthage.ENIbiblio.Services;

import Enicarthage.ENIbiblio.Entities.Utilisateurs.Reclamation;
import Enicarthage.ENIbiblio.Repositories.ReclamationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ReclamationService implements IReclamationService {
 private final ReclamationRepository ReclamationRepository;


    @Override
    public Reclamation ajouterReclamation(Reclamation b) {
        ReclamationRepository.save(b);
        return b;
    }

    @Override
    public Reclamation modifierReclamation(Reclamation b) {
        return ReclamationRepository.save(b);

    }

    @Override
    public void supprimerReclamation(Long id) {
        ReclamationRepository.deleteReclamationById(id);
    }

    @Override
    public List<Reclamation> listeReclamation() {
        List<Reclamation> liste= (List<Reclamation>) ReclamationRepository.findAll();
        return(liste);
    }}
