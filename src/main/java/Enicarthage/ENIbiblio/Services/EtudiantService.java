package Enicarthage.ENIbiblio.Services;


import Enicarthage.ENIbiblio.Entities.Bibliotheque.Bibliotheque;
import Enicarthage.ENIbiblio.Entities.Utilisateurs.Etudiant;
import Enicarthage.ENIbiblio.Repositories.EtudiantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class EtudiantService implements IEtudiantService {
    private final EtudiantRepository EtudiantRepository;


    @Override
    public Etudiant ajouterEtudiant(Etudiant b) {
        EtudiantRepository.save(b);
        return b;
    }

    @Override
    public Etudiant modifierEtudiant(Etudiant b) {
        return EtudiantRepository.save(b);

    }

    @Override
    public void supprimerEtudiant(Etudiant etudiant) {
        EtudiantRepository.delete(etudiant);
    }

    @Override
    public List<Etudiant> listeEtudiant() {
        List<Etudiant> liste= (List<Etudiant>) EtudiantRepository.findAll();
        return(liste);
    }

    @Override
    public Etudiant findEtudiantById(String id) {
        Etudiant etudiant =  EtudiantRepository.findById(id).orElse(null);
        return(etudiant);
    }
}