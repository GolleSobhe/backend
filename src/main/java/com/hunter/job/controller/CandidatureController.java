package com.hunter.job.controller;

import com.hunter.job.domain.Candidat;
import com.hunter.job.domain.Candidature;
import com.hunter.job.domain.Offre;
import com.hunter.job.services.CandidatService;
import com.hunter.job.services.CandidatureService;
import com.hunter.job.services.OffreService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Created by telly on 28/10/18.
 */
@RestController
@RequestMapping(value = "/api/v1/candidatures")
public class CandidatureController {

    @Autowired
    CandidatureService candidatureService;

    @Autowired
    CandidatService candidatService;

    @Autowired
    OffreService offreService;

    @ApiOperation(value = "enregistrer une candidature a une offre")
    @PostMapping(value = "/")
    public Candidature save(@RequestParam(value = "offre_id") Long offreId,
                            @RequestParam(value = "candidat_id") UUID candidatId){
        Candidat candidat = candidatService.findById(candidatId);
        Offre offre = offreService.findById(offreId);
        Candidature candidature = new Candidature();
        candidature.setCandidat(candidat);
        candidature.setOffre(offre);
        return candidatureService.save(candidature);
    }
}
