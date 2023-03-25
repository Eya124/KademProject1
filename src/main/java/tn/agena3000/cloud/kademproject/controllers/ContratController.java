package tn.agena3000.cloud.kademproject.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.agena3000.cloud.kademproject.Contrat;
import tn.agena3000.cloud.kademproject.Etudiant;
import tn.agena3000.cloud.kademproject.services.ContratServices;
import tn.agena3000.cloud.kademproject.services.IEtudiantServices;

import java.util.Date;
import java.util.List;
import java.util.Map;

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
    @PostMapping("/affCE")
    Contrat affectContratToEtudiant (@RequestBody Contrat ce, @RequestBody String nom ,@RequestBody String prenomE){
        return contratServices.affectContratToEtudiant(ce,nom,prenomE);
    };
    @GetMapping("/GetM")
    public Map<String,Float> getMontantContartEntreDeuxDate(int idUniv, Date startDate, Date endDate){
        return contratServices.getMontantContartEntreDeuxDate(idUniv,startDate,endDate);
    };
    @GetMapping("/GetNb")
    Integer nbContratsValides(Date startDate, Date endDate){
        return contratServices.nbContratsValides(startDate,endDate);
    };
    @PostMapping("/scheduler")

    String retrieveAndUpdateStatusContrat(){
        return contratServices.retrieveAndUpdateStatusContrat();
    };

}
