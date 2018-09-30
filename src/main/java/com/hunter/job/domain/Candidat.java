package com.hunter.job.domain;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.annotation.Generated;
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

    public Candidat(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
}
