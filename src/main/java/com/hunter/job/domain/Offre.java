package com.hunter.job.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Offre{

    public Offre() { }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String pays;

    @NotNull
    private String ville;

    @NotNull
    private String titre;

    @NotNull
    private String description;

    @ManyToOne
    private Entreprise entreprise;

    public Offre(String pays,String ville,String titre,String description,Entreprise entreprise){
        this.pays = pays;
        this.ville = ville;
        this.titre = titre;
        this.description = description;
        this.entreprise = entreprise;
    }

    public String getPays() {
        return pays;
    }

    public String getVille() {
        return ville;
    }

    public String getTitre() {
        return titre;
    }

    public String getDescription() {
        return description;
    }

    public Entreprise getEntreprise() {
        return entreprise;
    }

    public Long getId() {
        return id;
    }
}
