package com.hunter.job.controller;

import com.hunter.job.domain.Entreprise;
import com.hunter.job.dto.EntrepriseDto;
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
@RequestMapping("/entreprise")
public class EntrepriseController{


    @Autowired
    private EntrepriseService entrepriseService;

    @Autowired
    private FileStorageService fileStorageService;

    @GetMapping(value = "/all")
    @ApiOperation(value = "retourne la liste de toutes les entreprises")
    public List<Entreprise> getAll(){
        return entrepriseService.findAll();
    }

    @GetMapping(value = "/{id}")
    @ApiOperation(value = "retourne une entreprise")
    public Entreprise getById(@PathVariable Long id){
        return entrepriseService.findById(id);
    }

    @PostMapping(value = "/new")
    @ApiOperation(value = "enregistre une entreprise")
    public Entreprise save(@Valid @RequestBody EntrepriseDto entrepriseDto){
        Entreprise entreprise = new Entreprise(entrepriseDto);
        return entrepriseService.save(entreprise);
    }

    @PostMapping(value = "/logo/{id}")
    @ApiOperation(value = "enregistrer le logo d'une entreprise")
    public  void enregisterLogo(@PathVariable String id,@RequestParam("file") MultipartFile file) throws FileStorageException {
        String path = "./src/main/resources/logo";
        fileStorageService.storeFile(file,id,path);
    }

    @GetMapping(value = "/logo/{id}")
    @ApiOperation(value = "recupere le logo d'une entreprise")
    public  ResponseEntity<Resource> recupererLogo(@PathVariable String id, HttpServletRequest request) throws FileStorageException {
        String path = "./src/main/resources/logo";
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
