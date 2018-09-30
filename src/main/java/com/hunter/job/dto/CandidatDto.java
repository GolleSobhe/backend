package com.hunter.job.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

/**
 * Created by telly on 30/09/18.
 */
@Getter @Setter @NoArgsConstructor
public class CandidatDto {

    @NotNull
    private String nom;

    @NotNull
    private String prenom;

    public CandidatDto(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
}
