package tn.agena3000.cloud.kademproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.agena3000.cloud.kademproject.Departement;
import tn.agena3000.cloud.kademproject.DetailEquipe;
import tn.agena3000.cloud.kademproject.services.DepartementServices;
import tn.agena3000.cloud.kademproject.services.DetailEquipeServices;

import java.util.List;

@RestController

public class DetailEquipeContoller {
    @Autowired
    DetailEquipeServices detailEquipeServices;
    @GetMapping("/getALLDetailEquipe")
    public List<DetailEquipe> getAll(){
        return detailEquipeServices.getAll();
    }
    @GetMapping("/getDetailEquipeById/{id}")
    public DetailEquipe getById(int id){
        return detailEquipeServices.getByID(id);
    }
}
