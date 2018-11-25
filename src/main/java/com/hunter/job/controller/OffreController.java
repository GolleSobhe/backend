package com.hunter.job.controller;

import com.hunter.job.domain.Entreprise;
import com.hunter.job.domain.Offre;
import com.hunter.job.dto.OffreDto;
import com.hunter.job.services.EntrepriseService;
import com.hunter.job.services.OffreService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/offre")
@Api(description = "Controller pour les offres")
public class OffreController{

    @Autowired
    private OffreService offreService;

    @Autowired
    private EntrepriseService entrepriseService;

    @ApiOperation(value = "enregistrer une offre d'une entreprise")
    @PostMapping(value = "/new")
    public Offre save(@RequestParam(value = "entreprise_id") Long entrepriseId, @Valid @RequestBody OffreDto offreDto){
        Entreprise entreprise = entrepriseService.findById(entrepriseId);
        Offre offre = new Offre(offreDto,entreprise);
        return offreService.save(offre);
    }

    @ApiOperation(value = "recuperer les competences")
    @GetMapping(value = "/competences")
    public List<String> getCompetences(){
        String[] competences = new String[] {"Java EE","JQuery","NodeJS","Android","Angular","Front-End"};
        return Arrays.asList(competences);
    }

    @ApiOperation(value = "recuperer les specialisations")
    @GetMapping(value = "/specialisations")
    public List<String> getSpecialisations(){
        String[] specialisations = new String[] {"Frontend","Backend","Full Stack","Mobile","Big Data","Data Science"};
        return Arrays.asList(specialisations);
    }

    @ApiOperation(value = "recuperer les specialisations")
    @GetMapping(value = "/produits")
    public List<String> getProduits(){
        String[] produits = new String[] {"Chef de projet","Chef de produit","Design","Marketing"};
        return Arrays.asList(produits);
    }

    @ApiOperation(value = "recuperer les specialisations")
    @GetMapping(value = "/domaines")
    public List<String> getSecteursActivite(){
        String[] secteurs = new String[] {"Aéronotique","Télécommunication","Santé","Banque, Finance & Assurance",
                "Jeux Vidéo","Industrie","Énergie","Sécurité"};
        return Arrays.asList(secteurs);
    }

    @ApiOperation(value = "recuperer toutes les offres")
    @GetMapping(value = "/all")
    public List<Offre> getAll(){
        return offreService.findOffres();
    }

    @ApiOperation(value = "recuperer toutes les offres par page")
    @GetMapping(value = "")
    public Page<Offre> getByPage(@RequestParam(value = "pageNumber") int pageNumber,
                                 @RequestParam(value = "pageSize") int pageSize){
        PageRequest pageable = new PageRequest(pageNumber,pageSize);
        return offreService.findByPage(pageable);
    }

}
