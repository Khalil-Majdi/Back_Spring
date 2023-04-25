package Enicarthage.ENIbiblio.Services;

import Enicarthage.ENIbiblio.Entities.Bibliotheque.Reservation;
import Enicarthage.ENIbiblio.Repositories.ReservationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ReservationService implements IReservationService{

    private final ReservationRepository ReservationRepository;



    @Override
    public Reservation ajouterReservation(Reservation b) {
        ReservationRepository.save(b);
        return b;
    }

    @Override
    public Reservation modifierReservation(Reservation b) {
        return ReservationRepository.save(b);

    }

    @Override
    public void supprimerReservation(Long id) {
        ReservationRepository.deleteReservationById(id);
    }

    @Override
    public List<Reservation> listeReservation() {
        List<Reservation> liste= (List<Reservation>) ReservationRepository.findAll();
        return(liste);
    }
}
