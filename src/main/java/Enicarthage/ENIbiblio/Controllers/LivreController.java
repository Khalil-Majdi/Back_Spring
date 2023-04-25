package Enicarthage.ENIbiblio.Controllers;

import Enicarthage.ENIbiblio.Entities.Bibliotheque.Livre;
import Enicarthage.ENIbiblio.Services.LivreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/Livre")
public class LivreController {
    private final LivreService LivreService;

    @GetMapping("/getLivre")
    public List<Livre> getLivre(){
        List<Livre> Livre=LivreService.listeLivre();
        return(Livre);
    }


    @GetMapping("/getLivre/{id}")
    public ResponseEntity<Livre> getLivreById(@PathVariable Long id){
        Livre Livre=LivreService.findLivreById(id);
        return new ResponseEntity<>(Livre, HttpStatus.OK);
    }



    @PostMapping("/ajouterLivre")
    public ResponseEntity<Livre> ajouterLivre(@RequestBody Livre Livre){

        System.out.println(Livre);
        Livre newLivre = LivreService.ajouterLivre(Livre);
        return new ResponseEntity<>(newLivre, HttpStatus.CREATED);
    }

    @PutMapping("/modifierLivre/{id}")
    public ResponseEntity<Livre> modifierLivre(@RequestBody Livre Livre){
        Livre updatedLivre = LivreService.modifierLivre(Livre);
        return new ResponseEntity<>(updatedLivre, HttpStatus.OK);
    }

    @DeleteMapping("/supprimerLivre/{id}")
    public ResponseEntity<Map<String, Boolean>> supprimerLivre(@PathVariable Long id){



        Livre Livre=LivreService.findLivreById(id);
        LivreService.supprimerLivre(Livre);

        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }



}