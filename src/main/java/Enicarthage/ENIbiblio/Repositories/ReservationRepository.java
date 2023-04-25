package Enicarthage.ENIbiblio.Repositories;

import Enicarthage.ENIbiblio.Entities.Bibliotheque.Bibliotheque;
import Enicarthage.ENIbiblio.Entities.Bibliotheque.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository<Reservation,Long> {
    void deleteReservationById(Long id);
}
