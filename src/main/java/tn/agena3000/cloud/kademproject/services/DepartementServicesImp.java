package tn.agena3000.cloud.kademproject.services;

import org.springframework.stereotype.Service;
import tn.agena3000.cloud.kademproject.Departement;
import tn.agena3000.cloud.kademproject.repositories.DepartementRepository;

import java.util.List;
@Service
public class DepartementServicesImp implements DepartementServices{
    private DepartementRepository departementRepository;

    @Override
    public void ajouterDepartement(Departement e) {
        departementRepository.save(e);

    }

    @Override
    public void updateDepartement(Departement e) {
        departementRepository.save(e);

    }

    @Override
    public List<Departement> getAll() {
        return departementRepository.findAll();
    }

    @Override
    public Departement getByID(Integer id) {
        return departementRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteDepartement(Integer id) {
        departementRepository.deleteById(id);

    }
}
