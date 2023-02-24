package tn.agena3000.cloud.kademproject.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.agena3000.cloud.kademproject.Contrat;
import tn.agena3000.cloud.kademproject.Departement;
import tn.agena3000.cloud.kademproject.services.ContratServices;
import tn.agena3000.cloud.kademproject.services.DepartementServices;

import java.util.List;
@RestController
@RequiredArgsConstructor
@RequestMapping("departement")

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
    @DeleteMapping("{id}")
    private void deleteDepartement(@PathVariable int id){
        departementServices.deleteDepartement(id);
    }
    @PostMapping()
    public void ajouterDepartement(@RequestBody Departement departement){
        departementServices.ajouterDepartement(departement);
    }
    @PutMapping()
    private Departement updateDepartement(@RequestBody Departement departement){
        departementServices.updateDepartement(departement);
        return departement;
    }
}
