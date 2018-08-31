package com.hunter.job.controller;

import com.hunter.job.domain.Entreprise;
import com.hunter.job.domain.Offre;
import com.hunter.job.services.EntrepriseService;
import com.hunter.job.services.OffreService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/offre")
@Api(description = "Controller pour les offres")
public class OffreController{

    @Autowired
    private OffreService offreService;

    @Autowired
    private EntrepriseService entrepriseService;

    @ApiOperation(value = "enregistrer une offre d'une entreprise")
    @PostMapping(value = "/save/entreprise/{id}")
    public void save(@PathVariable(name = "id") Long idEntreprise,@RequestBody Offre offre){
        Entreprise entreprise = entrepriseService.findById(idEntreprise);
        offre.setEntreprise(entreprise);
        offreService.save(offre);
    }

}
