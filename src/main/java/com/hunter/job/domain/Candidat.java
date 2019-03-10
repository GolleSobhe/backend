package com.hunter.job.domain;

import com.hunter.job.dto.CandidatDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Email;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by telly on 11/02/18.
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Candidat{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

    public Candidat(String nom, String prenom, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }

    public  void validerCandidat(){
        estValide = true;
    }

}
