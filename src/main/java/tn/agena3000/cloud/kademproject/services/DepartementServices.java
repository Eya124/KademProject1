package tn.agena3000.cloud.kademproject.services;

import tn.agena3000.cloud.kademproject.Departement;
import tn.agena3000.cloud.kademproject.Equipe;

import java.util.List;

public interface DepartementServices {
    void ajouterDepartement(Departement e);
    void updateDepartement(Departement e);
    List<Departement > getAll();
    Departement  getByID(Integer id);
    void deleteDepartement(Integer id);
}
