package tn.agena3000.cloud.kademproject.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.agena3000.cloud.kademproject.Contrat;
import tn.agena3000.cloud.kademproject.Etudiant;

import java.util.List;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,Integer> {
    List<Contrat> findByContratArchive();
    Etudiant findByNomEAndPrenomE(String nom, String prenom);

}
