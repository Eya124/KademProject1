package tn.agena3000.cloud.kademproject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Universite {
    @Id
    private Integer iduniv ;
    private String nomUniv;
    @OneToMany
    List<Departement> departements;
}