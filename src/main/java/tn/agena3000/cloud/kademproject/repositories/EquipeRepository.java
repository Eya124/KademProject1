package tn.agena3000.cloud.kademproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.agena3000.cloud.kademproject.Equipe;
import tn.agena3000.cloud.kademproject.Etudiant;

import java.util.List;

public interface EquipeRepository extends JpaRepository<Equipe,Integer> {

}
