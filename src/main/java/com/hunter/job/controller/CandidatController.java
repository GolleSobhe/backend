package com.hunter.job.controller;

import com.hunter.job.domain.Candidat;
import com.hunter.job.exception.FileStorageException;
import com.hunter.job.services.CandidatService;
import com.hunter.job.services.FileStorageService;
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
@RequestMapping("/api/v1/candidats")
public class CandidatController{

    private static final String CV_PATH = "./src/main/resources/cv";

    @Autowired
    private CandidatService candidatService;

    @Autowired
    private FileStorageService fileStorageService;

    @PostMapping(value = "/")
    @ApiOperation(value = "enregistrer un candidat")
    public Candidat save(@Valid @RequestBody Candidat candidat,HttpServletRequest request){
        String rootUrl = getBaseUrlFromRequest(request);
       // String url = rootUrl+"/api/v1/candidats/verification/";
        String url = "https://gollesobhe.github.io/hunterJobWeb/";
        return candidatService.save(candidat,url);
    }


    @GetMapping(value = "/{id}")
    @ApiOperation(value = "rechercher un candidat")
    public Candidat getById(@PathVariable Long id) {
        return candidatService.findById(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    @ApiOperation(value = "modifie un candidat")
    public Candidat update(@Valid @RequestBody Candidat candidat){
        return candidatService.update(candidat.getId(), candidat);
    }

    @GetMapping(value = "/verification/{token}")
    @ApiOperation(value = "valider un candidat")
    public String validerCandidat(@PathVariable String token){
        return  candidatService.validateCandidat(token);
    }

    @PostMapping(value = "/{id}/cv")
    @ApiOperation(value = "enregistrer le cv d'un candidat")
    public  void enregisterCv(@PathVariable String id,@RequestParam("file") MultipartFile file) throws FileStorageException {
        fileStorageService.storeFile(file,id,CV_PATH);
    }

    @GetMapping(value = "/{id}/cv")
    @ApiOperation(value = "recuperer le cv d'un candidat")
    public  ResponseEntity<Resource> recupererCv(@PathVariable String id, HttpServletRequest request) throws FileStorageException {
        Resource resource = fileStorageService.retrieveFile(id,CV_PATH);
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


    private String getBaseUrlFromRequest(HttpServletRequest request){
            return request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
    }

}
