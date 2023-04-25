package Enicarthage.ENIbiblio.Controllers;

import Enicarthage.ENIbiblio.Entities.Bibliotheque.Emprunt;
import Enicarthage.ENIbiblio.Services.EmpruntService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/Emprunt")
public class EmpruntController {
    private final EmpruntService EmpruntService;

    @GetMapping("/getEmprunt")
    public List<Emprunt> getEmprunt(){
        List<Emprunt> Emprunt=EmpruntService.listeEmprunt();
        System.out.println("Houni emprunt !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println(Emprunt);
        return(Emprunt);
    }


    @GetMapping("/getEmprunt/{id}")
    public ResponseEntity<Emprunt> getEmpruntById(@PathVariable Long id){
        Emprunt Emprunt=EmpruntService.findEmpruntById(id);
        return new ResponseEntity<>(Emprunt, HttpStatus.OK);
    }
    @GetMapping("/getEmprunt/Etudiant/{id}")
    public List<Emprunt>  getEmpruntEtudiant(@PathVariable String id){
        List<Emprunt>  Emprunt=EmpruntService.listeEmpruntEtudiant(id);
        return Emprunt;
    }


    @PostMapping("/ajouterEmprunt")
    public ResponseEntity<Emprunt> ajouterEmprunt(@RequestBody Emprunt Emprunt){
        System.out.println("HOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOONIIIIIIIIIIIIIIIIIIIIIII");
        System.out.println(Emprunt.getEtudiant());
        Emprunt newEmprunt = EmpruntService.ajouterEmprunt(Emprunt);
        return new ResponseEntity<>(newEmprunt, HttpStatus.CREATED);
    }

    @PutMapping("/modifierEmprunt/{id}")
    public ResponseEntity<Emprunt> modifierEmprunt(@RequestBody Emprunt Emprunt){
        Emprunt updatedEmprunt = EmpruntService.modifierEmprunt(Emprunt);
        return new ResponseEntity<>(updatedEmprunt, HttpStatus.OK);
    }

    @DeleteMapping("/supprimerEmprunt/{id}")
    public ResponseEntity<Map<String, Boolean>> supprimerEmprunt(@PathVariable Long id){



        Emprunt Emprunt=EmpruntService.findEmpruntById(id);
        EmpruntService.supprimerEmprunt(Emprunt);

        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }



}