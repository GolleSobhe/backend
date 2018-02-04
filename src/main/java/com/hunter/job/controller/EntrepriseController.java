package com.hunter.job.controller;

import com.hunter.job.domain.Entreprise;
import com.hunter.job.services.EntrepriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by telly on 28/01/18.
 */
@RestController

public class EntrepriseController {

    @Autowired
    private EntrepriseService entrepriseService;

    @RequestMapping(value = "/entreprises", method = RequestMethod.GET)
    public List<Entreprise> obtenirEntreprises() {
        return this.entrepriseService.obtenirEntreprises();
    }


    @RequestMapping(value = "/entreprises/{id}",method = RequestMethod.GET)
    public Entreprise getEntreprise(@PathVariable("id") long id){
        return this.entrepriseService.obtenirEntrepriseParId(id);
    }
    @RequestMapping(value = "/entreprises/creerEntreprise", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Entreprise creerEntreprise(@RequestBody Entreprise entreprise){
        return this.entrepriseService.creerEntreprise(entreprise);
    }

    @RequestMapping(value = "/entreprises/{id}", method = RequestMethod.DELETE)
    public void supprimerEntreprise(@PathVariable("id") Long id){
        this.entrepriseService.supprimerEntreprise(id);
    }
}
