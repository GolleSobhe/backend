package com.hunter.job.controller;

import com.hunter.job.domain.Candidat;
import com.hunter.job.dto.CandidatDto;
import com.hunter.job.services.CandidatService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

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
    public Candidat save(@Valid @RequestBody CandidatDto candidatDto){
        Candidat candidat = new Candidat(candidatDto);
        return candidatService.save(candidat);
    }

    @GetMapping(value = "/{id}")
    @ApiOperation(value = "rechercher un candidat")
    public Candidat getById(@PathVariable Long id){
        return candidatService.findById(id);
    }
}
