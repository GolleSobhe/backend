package com.hunter.job.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.URL;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.UUID;

/**
 * Created by telly on 28/01/18.
 */
@Getter @Setter @NoArgsConstructor
@Entity
public class Entreprise{

    @Id
    private UUID id;

    @NotNull
    @Size(min = 1)
    private String nom;

    @NotNull
    @Size(min = 8)
    private String telephone;

    @NotNull
    @Size(min = 1)
    private String adresse;

    @Email
    @NotNull
    @Size(min = 1)
    private String email;

    @NotNull
    @Size(min = 5)
    @URL
    private String siteWeb;

    @NotNull
    @Size(min = 10)
    private String description;

    @NotNull
    @Size(min = 1)
    private String secteurActivite;

    public Entreprise(String nom, String telephone, String adresse, String email, String siteWeb, String description, String secteurActivite) {
        this.nom = nom;
        this.telephone = telephone;
        this.adresse = adresse;
        this.email = email;
        this.siteWeb = siteWeb;
        this.description = description;
        this.secteurActivite = secteurActivite;
    }
}
