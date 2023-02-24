package tn.agena3000.cloud.kademproject.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.agena3000.cloud.kademproject.Departement;
import tn.agena3000.cloud.kademproject.Etudiant;
import tn.agena3000.cloud.kademproject.repositories.DepartementRepository;
import tn.agena3000.cloud.kademproject.repositories.EtudiantRepository;

import java.util.List;
@Service
@RequiredArgsConstructor
public class IEtudiantServicesImp implements IEtudiantServices{
    private EtudiantRepository etudiantRepository;
    private DepartementRepository departementRepository;
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

    @Override
    public void assugnEtudiantToDepartement(Integer etudiantId, Integer departementId) {
        //récupération des objets
        // Etudiant etudiant = this.getById(etudiantId);
        Etudiant etudiant = etudiantRepository.findById(etudiantId).orElse(null);
        Departement departement = departementRepository.findById(departementId).orElse(null);

        //vérification des objets
        if ((etudiant!=null) && (departement!=null)) {
            //traitement
            etudiant.setDepartement(departement);
            //departement.getEtu().add(etudiant);
            //saving
            etudiantRepository.save(etudiant);
        }

    }
}
