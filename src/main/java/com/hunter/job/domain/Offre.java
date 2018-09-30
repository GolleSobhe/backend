package com.hunter.job.domain;

import com.hunter.job.dto.OffreDto;
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

    private String titre;

    private String description;

    private Long salaireMinimum;

    private Long salaireMaximum;

    private TypeOffre type;

    @ManyToOne
    private Entreprise entreprise;

    public Offre(OffreDto offreDto,Entreprise entreprise){
        this.titre = offreDto.getTitre();
        this.description = offreDto.getDescription();
        this.entreprise = entreprise;
        this.salaireMinimum = offreDto.getSalaireMinimum();
        this.salaireMaximum = offreDto.getSalaireMaximum();
        this.type = offreDto.getType();
    }


}
