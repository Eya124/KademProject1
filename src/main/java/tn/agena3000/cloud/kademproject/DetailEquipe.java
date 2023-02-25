package tn.agena3000.cloud.kademproject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class DetailEquipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idDetailEquipe;
    Integer salle;
    private String thematique;
    @OneToOne
    DetailEquipe detailEquipe;
}