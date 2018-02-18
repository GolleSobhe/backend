package com.hunter.job.domain;

import javax.persistence.Entity;

/**
 * Created by telly on 11/02/18.
 */
@Entity
public class Candidat extends ModelBasique{

    public Candidat(){

    }

    private  String prenom;

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPrenom() {
        return prenom;
    }
}
