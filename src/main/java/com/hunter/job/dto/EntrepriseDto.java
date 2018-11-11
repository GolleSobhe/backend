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

    @NotNull
    private String telephone;

    @NotNull
    private String adresse;

    @NotNull
    private String email;

    private String siteWeb;

    @NotNull
    private String description;

    private String secteurActivite;

    public EntrepriseDto(String nom,String telephone,String adresse,String email,String siteWeb,String description,String secteurActivite){
        this.nom = nom;
        this.telephone = telephone;
        this.adresse = adresse;
        this.email = email;
        this.siteWeb = siteWeb;
        this.description =description;
        this.secteurActivite = secteurActivite;
    }
}
