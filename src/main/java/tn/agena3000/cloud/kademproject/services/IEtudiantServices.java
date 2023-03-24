package tn.agena3000.cloud.kademproject.services;

import tn.agena3000.cloud.kademproject.Etudiant;

import java.util.List;

public interface IEtudiantServices {
    void ajouterEtudiant(Etudiant e);
    void updateEtudiant(Etudiant e);
    List<Etudiant> getAll();
    Etudiant getByID(Integer id);
    void deleteEtudiant(Integer id);
    void assugnEtudiantToDepartement(Integer etudiantId,Integer departemenId);
    Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe);
    List<Etudiant> getEtudiantsByDepartement (Integer idDepartement);

}
