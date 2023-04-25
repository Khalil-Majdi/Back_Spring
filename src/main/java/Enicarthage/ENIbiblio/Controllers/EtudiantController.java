package Enicarthage.ENIbiblio.Controllers;

import Enicarthage.ENIbiblio.Entities.Bibliotheque.Bibliotheque;
import Enicarthage.ENIbiblio.Entities.Utilisateurs.Etudiant;
import Enicarthage.ENIbiblio.Services.BibliothequeService;
import Enicarthage.ENIbiblio.Services.EtudiantService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/Etudiant")
 public class EtudiantController {
    private final EtudiantService EtudiantService;

    @GetMapping("/getEtudiant")
    public List<Etudiant> getEtudiant(){
        List<Etudiant> etudiant=EtudiantService.listeEtudiant();
        return(etudiant);
    }


    @GetMapping("/getEtudiant/{id}")
    public ResponseEntity<Etudiant> getEtudiantById(@PathVariable String id){
        Etudiant etudiant=EtudiantService.findEtudiantById(id);
        return new ResponseEntity<>(etudiant, HttpStatus.OK);
    }



    @PostMapping("/ajouterEtudiant")
    public ResponseEntity<Etudiant> ajouterEtudiant(@RequestBody Etudiant etudiant){
        Etudiant newEtudiant = EtudiantService.ajouterEtudiant(etudiant);
        return new ResponseEntity<>(newEtudiant, HttpStatus.CREATED);
    }

    @PutMapping("/modifierEtudiant/{id}")
    public ResponseEntity<Etudiant> modifierEtudiant(@RequestBody Etudiant etudiant){
        Etudiant updatedEtudiant = EtudiantService.modifierEtudiant(etudiant);
        return new ResponseEntity<>(updatedEtudiant, HttpStatus.OK);
    }

    @DeleteMapping("/supprimerEtudiant/{id}")
    public ResponseEntity<Map<String, Boolean>> supprimerEtudiant(@PathVariable String id){



        Etudiant etudiant=EtudiantService.findEtudiantById(id);
        EtudiantService.supprimerEtudiant(etudiant);

        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

}
