package tn.agena3000.cloud.kademproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.agena3000.cloud.kademproject.Departement;

import java.util.List;

public interface DepartementRepository extends JpaRepository<Departement,Integer> {

    /*@Query(value = "select * from departement d " +
            "inner join universite_departements ud " +
            "on ud.departements_id_depart = d.id_depart " +
            "inner join universite u " +
            "on u.id_univ = ud.universite_id_univ " +
            "where u.nom_univ =?1", nativeQuery = true)
    List<Departement> getAllDepartsByNomUnivSQL(String nomU);*/
    @Query(value = "select * from departement d\n" +
            "order by (SELECT count(*) from etudiant e " +
            "WHERE d.id_depart = e.departement_id_depart);", nativeQuery = true)
    List<Departement> getListDepartementsTrieesparEtudiantsSQL();
}

