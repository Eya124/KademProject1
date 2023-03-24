package tn.agena3000.cloud.kademproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import tn.agena3000.cloud.kademproject.Contrat;
import tn.agena3000.cloud.kademproject.Etudiant;
import tn.agena3000.cloud.kademproject.Specialite;
import tn.agena3000.cloud.kademproject.repositories.ContratRepository;
import tn.agena3000.cloud.kademproject.repositories.EtudiantRepository;

import java.time.LocalDate;
import java.util.*;

@Service
public class ContratServicesImp implements ContratServices{

    @Autowired
    private ContratRepository contratRepository;
    @Autowired
    private EtudiantRepository etudiantRepository;


    @Override
    public void ajouterContrat(Contrat e) {
        contratRepository.save(e);

    }

    @Override
    public void updateContrat(Contrat e) {
        contratRepository.save(e);

    }

    @Override
    public List<Contrat> getAll() {
        return contratRepository.findAll();
    }

    @Override
    public Contrat getByID(Integer id) {
        return contratRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteContrat(Integer id) {
        contratRepository.deleteById(id);

    }

    @Override
    public Contrat affectContratToEtudiant(Contrat ce, String nom, String prenomE) {
            Contrat contrat = contratRepository.findById(ce.getIdContrat()).orElse(null);
            Etudiant etudiant= etudiantRepository.findByNomEAndPrenomE(nom,prenomE);
            Assert.notNull(contrat, "universite must not be null.") ;
            Assert.notNull(etudiant, "universite must not be null.") ;
            if (etudiant.getContrat().size()>=5){
                return null;
            }
            etudiant.getContrat().add(contrat);
            etudiantRepository.save(etudiant);
            return contrat;

    }

    @Override
    public Map<String, Float> getMontantContartEntreDeuxDate(int idUniv, Date startDate, Date endDate) {
        List <Contrat> listC = new ArrayList<>();
        Map<String,Float> mapc= new HashMap<>();
        String specialite;
        float montant;
        listC.addAll(contratRepository.findAll());
        for(Contrat c:listC) {
            if (c.getDateFinContrat().before(startDate) || c.getDateDebutContrat().after(endDate))
                listC.remove(c);
            else{
                specialite = c.getSpecialite().toString();
                montant = mapc.getOrDefault(specialite, 0f);
                mapc.put(specialite, montant);
            }

        }





        return mapc;
    }

    @Override
    public Integer nbContratsValides(Date startDate, Date endDate) {
        List <Contrat> listC = new ArrayList<>();
        listC.addAll(contratRepository.findAllByArchiveIsFalse());
        for(Contrat c:listC) {
            if (c.getDateFinContrat().before(startDate) || c.getDateDebutContrat().after(endDate))
                listC.remove(c);}

        return listC.size();
    }

    @Override
    @Scheduled(cron = "0 0 13 * * ?")
    public String retrieveAndUpdateStatusContrat() {
        LocalDate date = LocalDate.now();
        LocalDate datefin =date.plusDays(15);
        List <Contrat> listC = new ArrayList<>();
        listC.addAll(contratRepository.findAllByArchiveIsFalse());
        for(Contrat c:listC) {
            if (c.getDateFinContrat().before(date) ){
                c.setArchive(true);
                contratRepository.save(c);
        }
            else {


            }
        }

        return null;
    }



}
