package com.hunter.job.controller;

import com.hunter.job.domain.Offre;
import com.hunter.job.services.OffreService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/offre")
@Api(description = "Controller pour les offres")
public class OffreController{

    @Autowired
    private OffreService offreService;

    @GetMapping
    @ApiOperation("Retourne la liste des offres en fonction du pays,de la ville,du titre et un numero de page obligatoire" +
            "les pages commencent à 0")
    public Page<Offre> findOffres(@RequestParam(value = "ville",required = false) String ville,
                                  @RequestParam(value = "pays",required = false) String pays,
                                  @RequestParam(value = "titre",required = false) String titre,
                                  @RequestParam(value = "page") int numeroPage){
        return offreService.findOffres(pays,ville,titre,numeroPage);
    }
}
