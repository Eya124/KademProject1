package tn.agena3000.cloud.kademproject.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.agena3000.cloud.kademproject.Etudiant;
import tn.agena3000.cloud.kademproject.repositories.EquipeRepository;
import tn.agena3000.cloud.kademproject.repositories.EtudiantRepository;
import tn.agena3000.cloud.kademproject.services.IEtudiantServices;

import java.util.List;

@RestController
@RequestMapping("etudiant")
@RequiredArgsConstructor
public class EtudiantController {
    @Autowired
    IEtudiantServices iEtudiantServices;
    private final EquipeRepository equipeRepository;
    private final EtudiantRepository etudiantRepository;

    @GetMapping("/sayHello")
    public String sayHello(){
        return "hello";
    }
    @GetMapping("/getALL")
    public List<Etudiant> getAll(){
        return iEtudiantServices.getAll();
    }
    @GetMapping("/getById/{id}")
    public Etudiant getById(@PathVariable int id){
        return iEtudiantServices.getByID(id);
    }

    @PostMapping ("/AddEtudiant")
    public void ADDEtudiant(@RequestBody Etudiant etudiant){
        iEtudiantServices.ajouterEtudiant(etudiant);
    }
    @PostMapping("/{idContrat}/{idEquipe}")
    public Etudiant addAndAssignEtudiantToEquipeAndContract(@RequestBody Etudiant e, @PathVariable Integer idContrat, @PathVariable Integer idEquipe) {
       return iEtudiantServices.addAndAssignEtudiantToEquipeAndContract(e,idContrat,idEquipe);

    }



    }
