package tn.agena3000.cloud.kademproject;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Contrat {
    @Id
    private Integer idContrat ;
    private Date dateDebutContrat;
    private Date dateFinContrat ;
    private Specialite specialite;
    private Boolean archive;
    private Integer montantContrat;
    @ManyToOne
    Etudiant etudiant;


}
