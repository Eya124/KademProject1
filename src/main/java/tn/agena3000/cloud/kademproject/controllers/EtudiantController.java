package tn.agena3000.cloud.kademproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.agena3000.cloud.kademproject.Etudiant;
import tn.agena3000.cloud.kademproject.services.IEtudiantServices;

import java.util.List;

@RestController
public class EtudiantController {
    @Autowired
    IEtudiantServices iEtudiantServices;
    @GetMapping("/sayHello")
    public String sayHello(){
        return "hello";
    }
    @GetMapping("/getALL")
    public List<Etudiant> getAll(){
        return iEtudiantServices.getAll();
    }
    @GetMapping("/getById/{id}")
    public Etudiant getById(int id){
        return iEtudiantServices.getByID(id);
    }

}
