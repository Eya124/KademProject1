package tn.agena3000.cloud.kademproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import tn.agena3000.cloud.kademproject.Departement;
import tn.agena3000.cloud.kademproject.Universite;
import tn.agena3000.cloud.kademproject.repositories.DepartementRepository;
import tn.agena3000.cloud.kademproject.repositories.EtudiantRepository;
import tn.agena3000.cloud.kademproject.repositories.UniversiteRepository;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class UniversiteServicesImp implements UniversiteServices {

    @Autowired
    private UniversiteRepository universiteRepository;
    private final DepartementRepository departementRepository;
    private final EtudiantRepository etudiantRepository;

    public UniversiteServicesImp(DepartementRepository departementRepository,
                                 EtudiantRepository etudiantRepository) {
        this.departementRepository = departementRepository;
        this.etudiantRepository = etudiantRepository;
    }

    @Override
    public void ajouterUniversite(Universite e) {
        universiteRepository.save(e);

    }

    @Override
    public void updateUniversite(Universite e) {
        universiteRepository.save(e);

    }

    @Override
    public List<Universite> getAll() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite getByID(Integer id) {
        return universiteRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteUniversite(Integer id) {
        universiteRepository.deleteById(id);
    }

    @Override
    @Transactional
    public void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement) {
        Universite universite = universiteRepository.findById(idUniversite).orElse(null);
        Departement departement = departementRepository.findById(idDepartement).orElse(null);

        Assert.notNull(universite, "universite must not be null.") ;
        Assert.notNull(departement, "departement must not be null.") ;
        // get la liste des départements ou tzidou département jdid
        universite.getDepartements().add(departement);
        /*List <Departement> departements= universite.getDepartments();
        departement.add (department);
        universite.setDepartements(departements);*/
        universiteRepository.save(universite);

    }

    @Override
    public List<Departement> retrieveDepartementsByUniversite(Integer idUniversite) {
        Universite universite = universiteRepository.findById(idUniversite).orElse(null);
        Assert.notNull(universite, "universite must not be null.") ;

        return universite.getDepartements();



    }
}
