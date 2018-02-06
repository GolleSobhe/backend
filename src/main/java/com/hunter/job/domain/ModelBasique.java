package com.hunter.job.domain;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public class ModelBasique implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id", nullable = false, columnDefinition = "BIGINT")
    private long id;

    @Column(name = "Nom")
    private String nom;


    public ModelBasique() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


}
