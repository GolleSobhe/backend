package com.hunter.job.domain;

import com.hunter.job.dto.CandidatDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by telly on 11/02/18.
 */
@Getter @NoArgsConstructor
@Entity
public class Candidat{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    private String prenom;

    private String email;

    private boolean estValide;

    public Candidat(CandidatDto candidatDto) {
        this.nom = candidatDto.getNom();
        this.prenom = candidatDto.getPrenom();
        this.email = candidatDto.getEmail();
        estValide = false;
    }

    public  void validerCandidat(){
        estValide = true;
    }
}
