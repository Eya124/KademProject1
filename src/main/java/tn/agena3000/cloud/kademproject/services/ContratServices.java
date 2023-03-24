package tn.agena3000.cloud.kademproject.services;

import org.springframework.stereotype.Service;
import tn.agena3000.cloud.kademproject.Contrat;
import tn.agena3000.cloud.kademproject.Departement;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public interface ContratServices {
    void ajouterContrat(Contrat e);
    void updateContrat(Contrat e);
    List<Contrat> getAll();
    Contrat  getByID(Integer id);
    void deleteContrat(Integer id);
    Contrat affectContratToEtudiant (Contrat ce, String nom , String prenomE);
    public Map<String,Float> getMontantContartEntreDeuxDate(int idUniv, Date startDate, Date endDate);

}

