package Enicarthage.ENIbiblio.Controllers;

import Enicarthage.ENIbiblio.Entities.Bibliotheque.Bibliotheque;
import Enicarthage.ENIbiblio.Entities.Bibliotheque.Livre;
import Enicarthage.ENIbiblio.Services.BibliothequeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/bibliotheque")
public class BibliothequeController {
    private final BibliothequeService bibliothequeService;

    @GetMapping("/getBibliotheque")
    public List<Bibliotheque> getBibliotheque(){
        List<Bibliotheque> bibliotheque=bibliothequeService.listeBibliotheque();
        return(bibliotheque);
    }


    @GetMapping("/getBibliotheque/{id}")
    public ResponseEntity<Bibliotheque> getBibliothequeById(@PathVariable Long id){
        Bibliotheque bibliotheque=bibliothequeService.findBibliothequeById(id);
        return new ResponseEntity<>(bibliotheque, HttpStatus.OK);
    }
    @GetMapping("/getLivreBibliotheque/{id}")
    public List<Livre> getLivreBibliotheque(@PathVariable Long id){
        List<Livre> Livre=bibliothequeService.listeLivreBibliotheque(id);
        return(Livre);
    }



    @PostMapping("/ajouterBibliotheque")
    public ResponseEntity<Bibliotheque> ajouterBibliotheque(@RequestBody Bibliotheque bibliotheque){
        Bibliotheque newBibliotheque = bibliothequeService.ajouterBibliotheque(bibliotheque);
        return new ResponseEntity<>(newBibliotheque, HttpStatus.CREATED);
    }

    @PutMapping("/modifierBibliotheque/{id}")
    public ResponseEntity<Bibliotheque> modifierBibliotheque(@RequestBody Bibliotheque bibliotheque){
        Bibliotheque updatedBibliotheque = bibliothequeService.modifierBibliotheque(bibliotheque);
        return new ResponseEntity<>(updatedBibliotheque, HttpStatus.OK);
    }

    @DeleteMapping("/supprimerBibliotheque/{id}")
    public ResponseEntity<Map<String, Boolean>> supprimerBibliotheque(@PathVariable Long id){



        Bibliotheque bibliotheque=bibliothequeService.findBibliothequeById(id);
        bibliothequeService.supprimerBibliotheque(bibliotheque);

        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }



}