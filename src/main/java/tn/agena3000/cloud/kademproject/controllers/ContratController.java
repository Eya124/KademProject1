package tn.agena3000.cloud.kademproject.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.agena3000.cloud.kademproject.Contrat;
import tn.agena3000.cloud.kademproject.Etudiant;
import tn.agena3000.cloud.kademproject.services.ContratServices;
import tn.agena3000.cloud.kademproject.services.IEtudiantServices;

import java.util.List;
@RestController
@RequestMapping("/Contrat")
@RequiredArgsConstructor
public class ContratController {
    @Autowired
    ContratServices contratServices ;
    @GetMapping("/getALLContrat")
    public List<Contrat> getAll(){
        return contratServices.getAll();
    }
    @GetMapping("/getByContratId/{id}")
    public Contrat getById(int id){
        return contratServices.getByID(id);
    }
    @DeleteMapping("/{id}")
    private void deletecontrat(@PathVariable int id){
        contratServices.deleteContrat(id);
    }
    @PostMapping()
    public void ajouterContrat(@RequestBody Contrat contrat){
        contratServices.ajouterContrat(contrat);
    }
    @PutMapping()
    private Contrat updateContrat(@RequestBody Contrat contrat){
        contratServices.updateContrat(contrat);
        return contrat;
    }

}
