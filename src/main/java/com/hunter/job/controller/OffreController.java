package com.hunter.job.controller;

import com.hunter.job.domain.Offre;
import com.hunter.job.services.OffreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OffreController{

    @Autowired
    private OffreService offreService;

    @GetMapping(value = "/api/v1/offres")
    public Page<Offre> findOffres(@RequestParam(value = "ville",required = false) String ville,
                                  @RequestParam(value = "pays",required = false) String pays,
                                  @RequestParam(value = "titre",required = false) String titre,
                                  @RequestParam(value = "page") int numeroPage){
        return offreService.findOffres(pays,ville,titre,numeroPage);
    }
}
