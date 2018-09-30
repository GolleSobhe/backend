package com.hunter.job.controller;

import com.hunter.job.domain.Candidat;
import com.hunter.job.dto.CandidatDto;
import com.hunter.job.services.CandidatService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by telly on 28/01/18.
 */
@RestController
@RequestMapping("/candidat")
@Api(description = "Controleur pour les candidats")
public class CandidatController{

    @Autowired
    private CandidatService candidatService;

    @PostMapping(value = "/new")
    @ApiOperation(value = "enregistrer un candidat")
    public Candidat save(@RequestBody CandidatDto candidatDto){
        Candidat candidat = new Candidat(candidatDto.getNom(),candidatDto.getPrenom());
        return candidatService.save(candidat);
    }
}
