package Enicarthage.ENIbiblio.Services;
import Enicarthage.ENIbiblio.Entities.Bibliotheque.Bibliotheque;
import Enicarthage.ENIbiblio.Entities.Utilisateurs.Administrateur;
import Enicarthage.ENIbiblio.Repositories.AdministrateurRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class AdministrateurService implements IAdministrateurService {
    private final AdministrateurRepository administrateurRepository;
    @Override
    public Administrateur ajouterAdministrateur(Administrateur b) {
        administrateurRepository.save(b);
        return b;
    }

    @Override
    public Administrateur modifierAdministrateur(Administrateur b) {
        return administrateurRepository.save(b);

    }

    @Override
    public void supprimerAdministrateur(Administrateur administrateur) {
        administrateurRepository.delete(administrateur);
    }

    @Override
    public List<Administrateur> listeAdministrateur() {
        List<Administrateur> liste= (List<Administrateur>) administrateurRepository.findAll();
        return(liste);
    }

    @Override
    public Administrateur findAdministrateurById(String id) {
        Administrateur administrateur =  administrateurRepository.findById(id).orElse(null);
        return(administrateur);
    }
}