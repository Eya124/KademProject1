package tn.agena3000.cloud.kademproject;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idContrat ;
    private Date dateDebutContrat;
    private Date dateFinContrat ;
    private Specialite specialite;
    private Boolean archive;
    private Integer montantContrat;
    @ManyToOne
    @JsonIgnore
    Etudiant etudiant;


}
