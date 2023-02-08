package tn.agena3000.cloud.kademproject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Equipe {
    @Id
    private Integer idEquipe;
    private String nomEquipe;
    private Niveau niveau;
    @ManyToMany(mappedBy = "equipes")
    List<Etudiant> etudiants;
}
