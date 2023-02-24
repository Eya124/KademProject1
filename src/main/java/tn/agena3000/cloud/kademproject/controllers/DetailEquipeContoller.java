package tn.agena3000.cloud.kademproject.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.agena3000.cloud.kademproject.Departement;
import tn.agena3000.cloud.kademproject.DetailEquipe;
import tn.agena3000.cloud.kademproject.services.DepartementServices;
import tn.agena3000.cloud.kademproject.services.DetailEquipeServices;

import java.util.List;

@RestController
@RequestMapping("detailequipe")
@RequiredArgsConstructor
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
    @DeleteMapping("{id}")
    private void deleteDetailEquipe(@PathVariable int id){
        detailEquipeServices.deleteDetailEquipe(id);
    }
    @PostMapping()
    public void ajouterDetailEquipe(@RequestBody DetailEquipe detailEquipe){
        detailEquipeServices.ajouterDetailEquipe(detailEquipe);
    }
    @PutMapping()
    private DetailEquipe updateDetailEquipe(@RequestBody DetailEquipe detailEquipe){
        detailEquipeServices.updateDetailEquipe(detailEquipe);
        return detailEquipe;
    }
}
