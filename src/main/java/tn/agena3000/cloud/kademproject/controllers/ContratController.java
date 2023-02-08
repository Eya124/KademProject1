package tn.agena3000.cloud.kademproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.agena3000.cloud.kademproject.Contrat;
import tn.agena3000.cloud.kademproject.Etudiant;
import tn.agena3000.cloud.kademproject.services.ContratServices;
import tn.agena3000.cloud.kademproject.services.IEtudiantServices;

import java.util.List;
@RestController

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
}
