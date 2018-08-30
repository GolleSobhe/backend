package com.hunter.job.controller;

import com.hunter.job.domain.Entreprise;
import com.hunter.job.services.EntrepriseService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by telly on 28/01/18.
 */
@RestController
@RequestMapping("/entreprise")
public class EntrepriseController{


    @Autowired
    private EntrepriseService entrepriseService;

    @GetMapping
    @ApiOperation(value = "retourne la liste de toutes les etreprises")
    public List<Entreprise> getAll(){
        return entrepriseService.findAll();
    }

}
