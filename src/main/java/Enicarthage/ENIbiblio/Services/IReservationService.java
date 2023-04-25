package Enicarthage.ENIbiblio.Services;

import Enicarthage.ENIbiblio.Entities.Bibliotheque.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation ajouterReservation(Reservation r);
    Reservation modifierReservation(Reservation r);
    void supprimerReservation(Long id);
    List<Reservation> listeReservation();
}
