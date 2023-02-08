package tn.agena3000.cloud.kademproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.agena3000.cloud.kademproject.Etudiant;
import tn.agena3000.cloud.kademproject.Universite;
import tn.agena3000.cloud.kademproject.services.IEtudiantServices;
import tn.agena3000.cloud.kademproject.services.UniversiteServices;

import java.util.List;
@RestController

public class UniversiteController {
    @Autowired
    UniversiteServices universiteServices;
    @GetMapping("/getALLUniversite")
    public List<Universite> getAll(){
        return universiteServices.getAll();
    }
    @GetMapping("/getUniversiteById/{id}")
    public Universite getById(int id){
        return universiteServices.getByID(id);
    }

}
