package tn.agena3000.cloud.kademproject.services;

import tn.agena3000.cloud.kademproject.Equipe;
import tn.agena3000.cloud.kademproject.Etudiant;

import java.util.List;

public interface IEquipeServices {
    void ajouterEquipe(Equipe e);
    void updateEquipe(Equipe e);
    List<Equipe> getAll();
    Equipe getByID(Integer id);
    void deleteEquipe(Integer id);
}
