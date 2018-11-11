package com.hunter.job.domain;

import com.hunter.job.dto.OffreDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter @NoArgsConstructor
@Entity
public class Offre{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titre;

    private String description;

    private Long salaire;

    private String lieu;

    private String specialisation;

    private String secteurActivite;

    private int anneesExperiences;

    private String competences;

    private TypeContrat type;

    @ManyToOne
    private Entreprise entreprise;

    public Offre(OffreDto offreDto,Entreprise entreprise){
        this.description = offreDto.getDescription();
        this.titre = offreDto.getTitre();
        this.salaire = offreDto.getSalaire();
        this.anneesExperiences = offreDto.getAnneesExperiences();
        this.competences = String.join(",",offreDto.getCompetences());
        this.lieu = offreDto.getLieu();
        this.secteurActivite = offreDto.getSecteurActivite();
        this.specialisation = offreDto.getSpecialisation();
        this.type = offreDto.getType();
        this.entreprise = entreprise;
    }


}
