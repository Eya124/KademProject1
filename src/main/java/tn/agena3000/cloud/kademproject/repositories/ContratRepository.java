package tn.agena3000.cloud.kademproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.agena3000.cloud.kademproject.Contrat;
import tn.agena3000.cloud.kademproject.Departement;

import java.util.List;

public interface ContratRepository extends JpaRepository<Contrat,Integer> {

    List<Contrat> findAllByArchiveIsFalse();
    List<Contrat> findAllByArchiveIsTrue();

}
