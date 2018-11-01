package com.hunter.job.dto;

import com.hunter.job.domain.TypeContrat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by telly on 16/09/18.
 */
@Getter @Setter @NoArgsConstructor
public class OffreDto {

    @NotNull
    private String titre;

    @NotNull
    private String description;

    @NotNull
    private Long salaire;

    @NotNull
    private String lieu;

    @NotNull
    private String specialisation;

    @NotNull
    private String secteurActivite;

    private int anneesExperiences;

    @NotNull
    private List<String> competences;

    @NotNull
    private TypeContrat type;

    public OffreDto(String titre,String description,Long salaire,String lieu,String specialisation,
                    String secteurActivite,int anneesExperiences,List<String> competences,TypeContrat type){
        this.description = description;
        this.titre = titre;
        this.salaire = salaire;
        this.anneesExperiences = anneesExperiences;
        this.competences = competences;
        this.lieu = lieu;
        this.secteurActivite = secteurActivite;
        this.specialisation = specialisation;
        this.type = type;
    }
}
