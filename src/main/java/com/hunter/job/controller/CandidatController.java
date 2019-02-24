package com.hunter.job.controller;

import com.hunter.job.domain.Candidat;
import com.hunter.job.dto.CandidatDto;
import com.hunter.job.exception.FileStorageException;
import com.hunter.job.services.CandidatService;
import com.hunter.job.services.FileStorageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.http.ResponseEntity;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;


/**
 * Created by telly on 28/01/18.
 */
@RestController
@RequestMapping("/candidat")
@Api(description = "Controleur pour les candidats")
public class CandidatController{

    @Autowired
    private CandidatService candidatService;

    @Autowired
    private FileStorageService fileStorageService;

    @PostMapping(value = "/new")
    @ApiOperation(value = "enregistrer un candidat")
    public Candidat save(@Valid @RequestBody CandidatDto candidatDto){
        Candidat candidat = new Candidat(candidatDto);
        return candidatService.save(candidat);
    }

    @GetMapping(value = "/verification/{token}")
    @ApiOperation(value = "valider un candidat")
    public String validerCandidat(@PathVariable String token){
        return  candidatService.validateCandidat(token);
    }

    @PostMapping(value = "/cv/{id}")
    @ApiOperation(value = "enregistrer le cv d'un candidat")
    public  void enregisterCv(@PathVariable String id,@RequestParam("file") MultipartFile file) throws FileStorageException {
        String path = "./src/main/resources/cv";
        fileStorageService.storeFile(file,id,path);
    }

    @GetMapping(value = "/cv/{id}")
    @ApiOperation(value = "recuperer le cv d'un candidat")
    public  ResponseEntity<Resource> recupererCv(@PathVariable String id, HttpServletRequest request) throws FileStorageException {
        String path = "./src/main/resources/cv";
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

    @GetMapping(value = "/{id}")
    @ApiOperation(value = "rechercher un candidat")
    public Candidat getById(@PathVariable Long id){
        return candidatService.findById(id);
    }
}
