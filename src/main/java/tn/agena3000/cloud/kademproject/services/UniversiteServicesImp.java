package tn.agena3000.cloud.kademproject.services;

import org.springframework.stereotype.Service;
import tn.agena3000.cloud.kademproject.Departement;
import tn.agena3000.cloud.kademproject.Universite;
import tn.agena3000.cloud.kademproject.repositories.DepartementRepository;
import tn.agena3000.cloud.kademproject.repositories.UniversiteRepository;

import java.util.List;
@Service
public class UniversiteServicesImp implements UniversiteServices {
    private UniversiteRepository universiteRepository;
    private final DepartementRepository departementRepository;

    public UniversiteServicesImp(DepartementRepository departementRepository) {
        this.departementRepository = departementRepository;
    }

    @Override
    public void ajouterUniversite(Universite e) {
        universiteRepository.save(e);

    }

    @Override
    public void updateUniversite(Universite e) {
        universiteRepository.save(e);

    }

    @Override
    public List<Universite> getAll() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite getByID(Integer id) {
        return universiteRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteUniversite(Integer id) {
        universiteRepository.deleteById(id);
    }

    @Override
    public void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement) {
        Universite universite = universiteRepository.findById(idUniversite).orElse(null);
        Departement departement = departementRepository.findById(idDepartement).orElse(null);

        if ((universite != null) && (departement != null)) {
            universite.getDepartements().add(departement);
            universiteRepository.save(universite);

        }
    }
}
