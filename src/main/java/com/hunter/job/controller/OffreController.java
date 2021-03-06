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
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/api/v1/offres")
public class OffreController{

    @Autowired
    private OffreService offreService;

    @Autowired
    private EntrepriseService entrepriseService;

    @ApiOperation(value = "enregistrer une offre d'une entreprise")
    @PostMapping(value = "/")
    public Offre save(@RequestParam(value = "entreprise_id") UUID entrepriseId, @Valid @RequestBody OffreDto offreDto){
        Entreprise entreprise = entrepriseService.findById(entrepriseId);
        Offre offre = new Offre(offreDto,entreprise);
        return offreService.save(offre);
    }

    @ApiOperation(value = "Retourne une offre")
    @GetMapping(value = "/{id}")
    public Offre findById(@PathVariable Long id){
        return this.offreService.findById(id);
    }

    @ApiOperation(value = "recuperer toutes les offres")
    @GetMapping(value = "/all")
    public List<Offre> getAll(){
        return offreService.findAll();
    }

    @ApiOperation(value = "recuperer toutes les offres par page")
    @GetMapping(value = "/")
    public Page<Offre> getAllByPage(@RequestParam(value = "pageNumber") int pageNumber,
                                    @RequestParam(value = "pageSize") int pageSize){
        PageRequest page = new PageRequest(pageNumber,pageSize);
        return offreService.findByPage(page);
    }

    @ApiOperation(value = "recuperer toutes les offres par Lieu et Titre par page")
    @GetMapping(value = "/filtrer")
    public Page<Offre> getByLieuAndSpecialisation(@RequestParam (value = "lieu",required = false) String lieu,
                                                  @RequestParam (value = "titre",required = false) String titre,
                                           @RequestParam(value = "pageNumber") int pageNumber,
                                           @RequestParam(value = "pageSize") int pageSize){
        PageRequest page = new PageRequest(pageNumber,pageSize);
        return offreService.findByLieuAndTitre(lieu,titre,page);
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

    @ApiOperation(value = "recuperer les specialisations")
    @GetMapping(value = "/typesContrat")
    public List<String> getTypesContrat(){
        String[] typesContrat = new String[] {"CDI", "CDD", "Apprentissage", "Stage", "Interim", "Freelance"};
        return Arrays.asList(typesContrat);
    }



}
