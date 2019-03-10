package com.hunter.job.controller;

import com.hunter.job.domain.Entreprise;
import com.hunter.job.exception.FileStorageException;
import com.hunter.job.services.EntrepriseService;
import com.hunter.job.services.FileStorageService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;
import java.util.List;

/**
 * Created by telly on 28/01/18.
 */
@RestController
@RequestMapping("/api/v1")
public class EntrepriseController{


    @Autowired
    private EntrepriseService entrepriseService;

    @Autowired
    private FileStorageService fileStorageService;

    @GetMapping(value = "/entreprises")
    @ApiOperation(value = "retourne la liste de toutes les entreprises")
    public List<Entreprise> findAll(){
        return entrepriseService.findAll();
    }

    @GetMapping(value = "/entreprises/{id}")
    @ApiOperation(value = "retourne une entreprise")
    public Entreprise findById(@PathVariable Long id){
        return entrepriseService.findById(id);
    }

    @PostMapping(value = "/entreprises")
    @ApiOperation(value = "enregistre une entreprise")
    public Entreprise save(@Valid @RequestBody Entreprise entreprise){
        return entrepriseService.save(entreprise);
    }

    @PutMapping(value = "/entreprises")
    @ApiOperation(value = "modifie une entreprise")
    public Entreprise update(@Valid @RequestBody Entreprise entreprise){
        return entrepriseService.update(entreprise);
    }

    @PostMapping(value = "/entreprises/logos/{id}")
    @ApiOperation(value = "enregistrer le logos d'une entreprise")
    public  void enregisterLogo(@PathVariable String id,@RequestParam("file") MultipartFile file) throws FileStorageException {
        String path = "./src/main/resources/logos";
        fileStorageService.storeFile(file,id,path);
    }

    @GetMapping(value = "/entreprises/logos/{id}")
    @ApiOperation(value = "recupere le logos d'une entreprise")
    public  ResponseEntity<Resource> recupererLogo(@PathVariable String id, HttpServletRequest request) throws FileStorageException {
        String path = "./src/main/resources/logos";
        Resource resource = fileStorageService.retrieveFile(id,path);
        String contentType = null;
        try {
            contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
        } catch (IOException e) {
            throw new FileStorageException("non ");
        }
        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(contentType))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
                .body(resource);
    }

}
