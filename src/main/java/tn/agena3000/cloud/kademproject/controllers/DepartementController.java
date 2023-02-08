package tn.agena3000.cloud.kademproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.agena3000.cloud.kademproject.Contrat;
import tn.agena3000.cloud.kademproject.Departement;
import tn.agena3000.cloud.kademproject.services.ContratServices;
import tn.agena3000.cloud.kademproject.services.DepartementServices;

import java.util.List;
@RestController

public class DepartementController {
    @Autowired
    DepartementServices departementServices;
    @GetMapping("/getALLDepartement")
    public List<Departement> getAll(){
        return departementServices.getAll();
    }
    @GetMapping("/getDepartementById/{id}")
    public Departement getById(int id){
        return departementServices.getByID(id);
    }
}
