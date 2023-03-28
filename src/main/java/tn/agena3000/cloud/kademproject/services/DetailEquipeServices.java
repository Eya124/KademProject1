package tn.agena3000.cloud.kademproject.services;

import org.springframework.stereotype.Service;
import tn.agena3000.cloud.kademproject.Departement;
import tn.agena3000.cloud.kademproject.DetailEquipe;

import java.util.List;
@Service
public interface DetailEquipeServices {
    void ajouterDetailEquipe(DetailEquipe e);
    void updateDetailEquipe(DetailEquipe e);
    List<DetailEquipe > getAll();
    DetailEquipe  getByID(Integer id);
    void deleteDetailEquipe(Integer id);

}
