package tn.agena3000.cloud.kademproject.services;

import tn.agena3000.cloud.kademproject.Etudiant;
import tn.agena3000.cloud.kademproject.Universite;
import tn.agena3000.cloud.kademproject.repositories.UniversiteRepository;

import java.util.List;

public interface UniversiteServices {
    void ajouterUniversite(Universite e);
    void updateUniversite(Universite e);
    List<Universite> getAll();
    Universite getByID(Integer id);
    void deleteUniversite(Integer id);
    public void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement);
}
