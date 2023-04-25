package Enicarthage.ENIbiblio.Controllers;


import Enicarthage.ENIbiblio.Entities.Utilisateurs.Administrateur;
import Enicarthage.ENIbiblio.Services.AdministrateurService;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/administrateur")
public class AdministrateurController {
    private final AdministrateurService administrateurService;

    @GetMapping("/getAdministrateur")
    public List<Administrateur> getAdministrateur(){
        List<Administrateur> administrateur=administrateurService.listeAdministrateur();
        return(administrateur);
    }


    @GetMapping("/getAdministrateur/{id}")
    public ResponseEntity<Administrateur> getAdministrateurById(@PathVariable String id){
        Administrateur administrateur=administrateurService.findAdministrateurById(id);
        return new ResponseEntity<>(administrateur, HttpStatus.OK);
    }



    @PostMapping("/ajouterAdministrateur")
    public ResponseEntity<Administrateur> ajouterAdministrateur(@RequestBody Administrateur administrateur){
        Administrateur newAdministrateur = administrateurService.ajouterAdministrateur(administrateur);
        return new ResponseEntity<>(newAdministrateur, HttpStatus.CREATED);
    }

    @PutMapping("/modifierAdministrateur/{id}")
    public ResponseEntity<Administrateur> modifierAdministrateur(@RequestBody Administrateur administrateur){
        Administrateur updatedAdministrateur = administrateurService.modifierAdministrateur(administrateur);
        return new ResponseEntity<>(updatedAdministrateur, HttpStatus.OK);
    }

    @DeleteMapping("/supprimerAdministrateur/{id}")
    public ResponseEntity<Map<String, Boolean>> supprimerAdministrateur(@PathVariable String id){



        Administrateur administrateur=administrateurService.findAdministrateurById(id);
        administrateurService.supprimerAdministrateur(administrateur);

        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }



}