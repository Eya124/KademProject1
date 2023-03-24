package tn.agena3000.cloud.kademproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.agena3000.cloud.kademproject.Departement;
import tn.agena3000.cloud.kademproject.Universite;

import java.util.List;

public interface UniversiteRepository extends JpaRepository<Universite,Integer> {
  //List<Departement> findByDepartement(Integer iddep);

}

