package Enicarthage.ENIbiblio.Controllers;

import Enicarthage.ENIbiblio.Entities.Utilisateurs.Reclamation;
import Enicarthage.ENIbiblio.Services.ReclamationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


    @RequiredArgsConstructor
    @RestController
    @RequestMapping("/api/Reclamation")
    public class ReclamationController {
        private final ReclamationService Reclamationervice;

        @GetMapping("/getReclamation")
        public List<Reclamation> getReclamation(){
            List<Reclamation> Reclamation=Reclamationervice.listeReclamation();
            return(Reclamation);
        }
        @PostMapping("/ajouterReclamation")
        public ResponseEntity<Reclamation> ajouterReclamation(@RequestBody Reclamation Reclamation){
            Reclamation newReclamation = Reclamationervice.ajouterReclamation(Reclamation);
            return new ResponseEntity<>(newReclamation, HttpStatus.CREATED);
        }

        @PutMapping("/modifierReclamation")
        public ResponseEntity<Reclamation> modifierReclamation(@RequestBody Reclamation Reclamation){
            Reclamation updatedReclamation = Reclamationervice.modifierReclamation(Reclamation);
            return new ResponseEntity<>(updatedReclamation, HttpStatus.OK);
        }
}
