package tn.agena3000.cloud.kademproject.services;

import org.springframework.stereotype.Service;
import tn.agena3000.cloud.kademproject.Etudiant;
import tn.agena3000.cloud.kademproject.repositories.EtudiantRepository;

import java.util.List;
@Service

public class IEtudiantServicesImp implements IEtudiantServices{
    private EtudiantRepository etudiantRepository;
    @Override
    public void ajouterEtudiant(Etudiant e) {
        etudiantRepository.save(e);

    }

    @Override
    public void updateEtudiant(Etudiant e) {
        etudiantRepository.save(e);

    }

    @Override
    public List<Etudiant> getAll() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant getByID(Integer id) {
        //il orElse t5alih kn me l9ach il etudiant yraja3li null
        return etudiantRepository.findById(id).orElse(null);

    }

    @Override
    public void deleteEtudiant(Integer id) {
        etudiantRepository.deleteById(id);

    }
}
