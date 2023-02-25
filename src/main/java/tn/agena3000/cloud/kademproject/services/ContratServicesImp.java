package tn.agena3000.cloud.kademproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.agena3000.cloud.kademproject.Contrat;
import tn.agena3000.cloud.kademproject.repositories.ContratRepository;
import tn.agena3000.cloud.kademproject.repositories.EtudiantRepository;

import java.util.List;

@Service
public class ContratServicesImp implements ContratServices{

    @Autowired
    private ContratRepository contratRepository;




    @Override
    public void ajouterContrat(Contrat e) {
        contratRepository.save(e);

    }

    @Override
    public void updateContrat(Contrat e) {
        contratRepository.save(e);

    }

    @Override
    public List<Contrat> getAll() {
        return contratRepository.findAll();
    }

    @Override
    public Contrat getByID(Integer id) {
        return contratRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteContrat(Integer id) {
        contratRepository.deleteById(id);

    }
}
