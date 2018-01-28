package com.hunter.job.controller;

import com.hunter.job.domain.Entreprise;
import com.hunter.job.services.EntrepriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by telly on 28/01/18.
 */
@RestController
public class EntrepriseController {

    @Autowired
    private EntrepriseService entrepriseService;

    @RequestMapping(value = "/entreprise/{id}",method = RequestMethod.GET)
    public Entreprise getEntreprise(@PathVariable("id") long id){
        return this.entrepriseService.obtenirEntreprise(id);
    }
}
