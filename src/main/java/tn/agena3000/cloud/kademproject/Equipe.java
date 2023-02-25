package tn.agena3000.cloud.kademproject;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idEquipe;
    private String nomEquipe;
    private Niveau niveau;
    @JsonIgnore
    @ManyToMany(mappedBy = "equipes")
    List<Etudiant> etudiants;
}
