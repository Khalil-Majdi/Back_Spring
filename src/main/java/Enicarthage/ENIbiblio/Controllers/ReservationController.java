package Enicarthage.ENIbiblio.Controllers;

import Enicarthage.ENIbiblio.Entities.Bibliotheque.Reservation;
import Enicarthage.ENIbiblio.Services.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


    @RequiredArgsConstructor
    @RestController
    @RequestMapping("/api/Reservation")
    public class ReservationController {
        private final ReservationService ReservationService;

        @GetMapping("/getReservation")
        public List<Reservation> getReservation(){
            List<Reservation> Reservation=ReservationService.listeReservation();
            return(Reservation);
        }
        @PostMapping("/ajouterReservation")
        public ResponseEntity<Reservation> ajouterReservation(@RequestBody Reservation Reservation){
            Reservation newReservation = ReservationService.ajouterReservation(Reservation);
            return new ResponseEntity<>(newReservation, HttpStatus.CREATED);
        }

        @PutMapping("/modifierReservation")
        public ResponseEntity<Reservation> modifierReservation(@RequestBody Reservation Reservation){
            Reservation updatedReservation = ReservationService.modifierReservation(Reservation);
            return new ResponseEntity<>(updatedReservation, HttpStatus.OK);
        }
}
