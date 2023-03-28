package tn.agena3000.cloud.kademproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.agena3000.cloud.kademproject.DetailEquipe;
import tn.agena3000.cloud.kademproject.Equipe;
import tn.agena3000.cloud.kademproject.services.DetailEquipeServices;
import tn.agena3000.cloud.kademproject.services.IEquipeServices;

import java.util.List;
@RestController

public class EquipeController {
    @Autowired
    IEquipeServices iEquipeServices ;
    @GetMapping("/getALLEquipe")
    public List<Equipe> getAll(){
        return iEquipeServices.getAll();
    }
    @GetMapping("/getEquipeById/{id}")
    public  Equipe getById(int id){
        return iEquipeServices.getByID(id);
    }
    @DeleteMapping("{id}")
    private void deleteEquipe(@PathVariable int id){
        iEquipeServices.deleteEquipe(id);
    }
    @PostMapping("/ajout")
    public void ajouterEquipe(@RequestBody Equipe equipe){
        iEquipeServices.ajouterEquipe(equipe);
    }
    @PutMapping("/update")
    private Equipe updateEquipe(@RequestBody Equipe equipe){
        iEquipeServices.updateEquipe(equipe);
        return equipe;
    }
    @PostMapping("/evoluer")
    public void faireEvoluerEquipes(){
        iEquipeServices.faireEvoluerEquipes();
    }
}
