package Enicarthage.ENIbiblio.Controllers;

import Enicarthage.ENIbiblio.Entities.Bibliotheque.Chaise;
import Enicarthage.ENIbiblio.Services.ChaiseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/Chaise")
public class ChaiseController {
    private final ChaiseService ChaiseService;

    @GetMapping("/getChaise")
    public List<Chaise> getChaise(){
        List<Chaise> Chaise=ChaiseService.listeChaise();
        return(Chaise);
    }


    @GetMapping("/getChaise/{id}")
    public ResponseEntity<Chaise> getChaiseById(@PathVariable Long id){
        Chaise Chaise=ChaiseService.findChaiseById(id);
        return new ResponseEntity<>(Chaise, HttpStatus.OK);
    }



    @PostMapping("/ajouterChaise")
    public ResponseEntity<Chaise> ajouterChaise(@RequestBody Chaise Chaise){
        Chaise newChaise = ChaiseService.ajouterChaise(Chaise);
        return new ResponseEntity<>(newChaise, HttpStatus.CREATED);
    }

    @PutMapping("/modifierChaise/{id}")
    public ResponseEntity<Chaise> modifierChaise(@RequestBody Chaise Chaise){
        Chaise updatedChaise = ChaiseService.modifierChaise(Chaise);
        return new ResponseEntity<>(updatedChaise, HttpStatus.OK);
    }

    @DeleteMapping("/supprimerChaise/{id}")
    public ResponseEntity<Map<String, Boolean>> supprimerChaise(@PathVariable Long id){



        Chaise Chaise=ChaiseService.findChaiseById(id);
        ChaiseService.supprimerChaise(Chaise);

        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }



}