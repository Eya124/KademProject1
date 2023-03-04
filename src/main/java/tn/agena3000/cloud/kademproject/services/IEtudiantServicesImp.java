package tn.agena3000.cloud.kademproject.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import tn.agena3000.cloud.kademproject.Contrat;
import tn.agena3000.cloud.kademproject.Departement;
import tn.agena3000.cloud.kademproject.Equipe;
import tn.agena3000.cloud.kademproject.Etudiant;
import tn.agena3000.cloud.kademproject.repositories.ContratRepository;
import tn.agena3000.cloud.kademproject.repositories.DepartementRepository;
import tn.agena3000.cloud.kademproject.repositories.EquipeRepository;
import tn.agena3000.cloud.kademproject.repositories.EtudiantRepository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class IEtudiantServicesImp implements IEtudiantServices{

    @Autowired
    private EtudiantRepository etudiantRepository;
    private DepartementRepository departementRepository;
    private final ContratRepository contratRepository;
    private final EquipeRepository equipeRepository;

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

    @Override
    @Transactional
    public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe) {

        Contrat contrat = contratRepository.findById(idContrat).orElse(null);
        Equipe equipe= equipeRepository.findById(idEquipe).orElse(null);
        Assert.notNull(contrat, "universite must not be null.") ;
        Assert.notNull(equipe, "equi must not be null.") ;
        //ki yabda andi objet jdid me houch jei mil bd na3emlou 3 line
        List<Equipe> equipes =new ArrayList<>();
        equipes.add(equipe);
        e.setEquipes(equipes);
        // KHATER ANDICH LIST
        etudiantRepository.saveAndFlush(e);
        contrat.setEtudiant(e);
        //contratRepository.save(contrat);
        return e;



    }






}
