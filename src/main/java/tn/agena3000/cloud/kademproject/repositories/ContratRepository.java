package tn.agena3000.cloud.kademproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.agena3000.cloud.kademproject.Contrat;
import tn.agena3000.cloud.kademproject.Departement;

import java.util.List;

public interface ContratRepository extends JpaRepository<Contrat,Integer> {

    @Query("select c from Contrat c where c.archive = false")
    List<Contrat> findAllByArchiveIsFalse();
    List<Contrat> findAllByArchiveIsTrue();

}
