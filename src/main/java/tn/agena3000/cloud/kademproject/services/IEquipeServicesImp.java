package tn.agena3000.cloud.kademproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.agena3000.cloud.kademproject.Contrat;
import tn.agena3000.cloud.kademproject.Equipe;
import tn.agena3000.cloud.kademproject.Etudiant;
import tn.agena3000.cloud.kademproject.Niveau;
import tn.agena3000.cloud.kademproject.repositories.EquipeRepository;
import tn.agena3000.cloud.kademproject.repositories.EtudiantRepository;

import java.util.List;
@Service
public class IEquipeServicesImp implements IEquipeServices{

    @Autowired
    private EquipeRepository equipeRepository;
    @Override
    public void ajouterEquipe(Equipe e) {
        equipeRepository.save(e);

    }

    @Override
    public void updateEquipe(Equipe e) {
        equipeRepository.save(e);

    }

    @Override
    public List<Equipe> getAll() {
        return equipeRepository.findAll();
    }

    @Override
    public Equipe getByID(Integer id) {
        return equipeRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteEquipe(Integer id) {
        equipeRepository.deleteById(id);

    }

    @Override
    public void faireEvoluerEquipes() {
        List<Equipe> listE = equipeRepository.findAll();
        for(Equipe e:listE) {
            if (e.getEtudiants().size()==3 ){
                if (e.getNiveau()== Niveau.JUNIOR)
                {e.setNiveau(Niveau.SENIOR);
                equipeRepository.save(e);}
                else if (e.getNiveau()==Niveau.SENIOR) {
                    e.setNiveau(Niveau.EXPERT);
                    equipeRepository.save(e);

                }
            }



        }

    }
}
