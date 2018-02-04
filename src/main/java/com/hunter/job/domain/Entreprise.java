package com.hunter.job.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by telly on 28/01/18.
 */
@Entity
public class Entreprise {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String nom;

    public Entreprise() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


}
