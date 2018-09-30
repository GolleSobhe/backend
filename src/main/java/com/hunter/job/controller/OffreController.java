package com.hunter.job.controller;

import com.hunter.job.domain.Entreprise;
import com.hunter.job.domain.Offre;
import com.hunter.job.dto.OffreDto;
import com.hunter.job.services.EntrepriseService;
import com.hunter.job.services.OffreService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
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
    public void save(@PathVariable(name = "id") Long idEntreprise,@RequestBody OffreDto offreDto){
        Entreprise entreprise = entrepriseService.findById(idEntreprise);
        Offre offre = new Offre(offreDto,entreprise);
        offreService.save(offre);
    }

}
