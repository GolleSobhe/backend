package com.hunter.job.domain;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter @Setter @NoArgsConstructor
@Entity
public class Offre{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String titre;

    @NotNull
    private String description;

    @NotNull
    private Long salaireMinimum;

    @NotNull
    private Long salaireMaximum;

    @NotNull
    private TypeOffre type;

    @ManyToOne
    private Entreprise entreprise;

    public Offre(String titre,String description,Entreprise entreprise,Long salaireMinimum,Long salaireMaximum,TypeOffre type){
        this.titre = titre;
        this.description = description;
        this.entreprise = entreprise;
        this.salaireMinimum = salaireMinimum;
        this.salaireMaximum = salaireMaximum;
        this.type = type;
    }


}
