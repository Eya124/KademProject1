package tn.agena3000.cloud.kademproject.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.agena3000.cloud.kademproject.Etudiant;
import tn.agena3000.cloud.kademproject.Universite;
import tn.agena3000.cloud.kademproject.services.IEtudiantServices;
import tn.agena3000.cloud.kademproject.services.UniversiteServices;

import java.util.List;
@RestController
@RequestMapping("universite")
@RequiredArgsConstructor

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
    @DeleteMapping("/DeleteUniversite/{id}")
    public void deleteUniversite(@PathVariable int id){
        universiteServices.deleteUniversite(id);
    }
    @PostMapping("ajoutUniversite")
    public void ajoutUniversite(@RequestBody Universite universite){
        universiteServices.ajouterUniversite(universite);
    }
    @PutMapping("/updateUniversite")
    public Universite updateUniversite(@RequestBody Universite universite){
        universiteServices.updateUniversite(universite);
        return universite;
    }

}
