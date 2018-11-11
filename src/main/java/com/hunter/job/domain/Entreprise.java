package com.hunter.job.domain;

import com.hunter.job.dto.EntrepriseDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by telly on 28/01/18.
 */
@Getter @Setter @NoArgsConstructor
@Entity
public class Entreprise{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    private String telephone;

    private String adresse;

    private String email;

    private String siteWeb;

    private String description;

    private String secteurActivite;

    public Entreprise(EntrepriseDto entrepriseDto){
        this.nom = entrepriseDto.getNom();
        this.adresse = entrepriseDto.getAdresse();
        this.email = entrepriseDto.getEmail();
        this.secteurActivite = entrepriseDto.getSecteurActivite();
        this.siteWeb = entrepriseDto.getSiteWeb();
        this.description = entrepriseDto.getDescription();
        this.telephone = entrepriseDto.getTelephone();
    }

}
