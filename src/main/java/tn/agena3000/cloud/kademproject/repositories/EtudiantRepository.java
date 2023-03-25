package tn.agena3000.cloud.kademproject.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tn.agena3000.cloud.kademproject.Contrat;
import tn.agena3000.cloud.kademproject.Departement;
import tn.agena3000.cloud.kademproject.Etudiant;

import java.util.List;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,Integer> {
    Etudiant findByNomEAndPrenomE(String nom, String prenom);
    //List<Etudiant> findByDepartement(Departement departement);
   // List<Etudiant> findByidDepartDepartement(Integer idDep);
    @Query("SELECT e from Etudiant e where e.nomE=?1 and  e.prenomE=?2")
    Etudiant findByNome(String nom, String prenom);
}
