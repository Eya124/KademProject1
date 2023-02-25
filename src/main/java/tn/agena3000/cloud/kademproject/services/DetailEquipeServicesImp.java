package tn.agena3000.cloud.kademproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.agena3000.cloud.kademproject.Departement;
import tn.agena3000.cloud.kademproject.DetailEquipe;
import tn.agena3000.cloud.kademproject.repositories.DetailEquipeRepository;

import java.util.List;
@Service
public class DetailEquipeServicesImp implements DetailEquipeServices{

    @Autowired
    private DetailEquipeRepository detailEquipeRepository;
    @Override
    public void ajouterDetailEquipe(DetailEquipe e) {
        detailEquipeRepository.save(e);
    }

    @Override
    public void updateDetailEquipe(DetailEquipe e) {
       detailEquipeRepository.save(e);
    }

    @Override
    public List<DetailEquipe> getAll() {
        return detailEquipeRepository.findAll();
    }

    @Override
    public DetailEquipe getByID(Integer id) {
        return detailEquipeRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteDetailEquipe(Integer id) {
        detailEquipeRepository.deleteById(id);

    }
}
