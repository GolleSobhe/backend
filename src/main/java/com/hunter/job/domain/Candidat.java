package com.hunter.job.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Email;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.UUID;

/**
 * Created by telly on 11/02/18.
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Candidat{


    @Id
    private UUID id;

    @NotNull
    @Size(min = 1)
    private String nom;

    @NotNull
    @Size(min = 1)
    private String prenom;

    @NotNull
    @Size(min = 5)
    @Email
    private String email;

    @NotNull
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    private String telephone;

    private String titreProfil;

    private String adresse;

    private Number anneesExperiences;

    private Number anneesEtudes;

    private Number salaire;

    private Boolean relocalisation = false;

    private Boolean cdi = false;
    private Boolean cdd = false;
    private Boolean stage = false;
    private Boolean interim = false;
    private Boolean apprentissage = false;
    private Boolean professionnalisation = false;
    private Boolean freelance = false;

    private boolean estValide = false;


    public  void validerCandidat(){
        estValide = true;
    }

}
