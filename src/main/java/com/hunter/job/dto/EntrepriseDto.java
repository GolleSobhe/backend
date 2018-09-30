package com.hunter.job.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

/**
 * Created by telly on 30/09/18.
 */
@Setter @Getter @NoArgsConstructor
public class EntrepriseDto {

    @NotNull
    private String nom;

    public EntrepriseDto(String nom){
        this.nom = nom;
    }
}
