package com.hunter.job.controller;

import com.hunter.job.domain.Candidat;
import com.hunter.job.exception.FileStorageException;
import com.hunter.job.services.CandidatService;
import com.hunter.job.services.FileStorageService;
import com.hunter.job.utils.FileDownloadUtils;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.http.ResponseEntity;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.UUID;
import java.util.List;



/**
 * Created by telly on 28/01/18.
 */
@RestController
@RequestMapping("/api/v1")
public class CandidatController{

    private static final String CV_PATH = "./src/main/resources/cv";
    private static final String URL = "https://gollesobhe.github.io/hunterJobWeb/";

    @Autowired
    private CandidatService candidatService;

    @Autowired
    private FileStorageService fileStorageService;

    @PostMapping(value = "/candidats/")
    @ApiOperation(value = "enregistrer un candidat")
    public Candidat save(@Valid @RequestBody Candidat candidat,HttpServletRequest request){
        Candidat savedCandidat = candidatService.save(candidat);
        candidatService.sendConfirmationEmail(savedCandidat,URL);
        return savedCandidat;
    }

    @GetMapping(value = "/connection")
    public String seConnecter(@RequestParam String email,@RequestParam String password){
        return candidatService.connect(email,password);
    }

    @GetMapping(value = "/candidats/{id}")
    @ApiOperation(value = "rechercher un candidat")
    public Candidat getById(@PathVariable UUID id) {
        return candidatService.findById(id);
    }

    @RequestMapping(value = "/candidats", method = RequestMethod.PUT)
    @ApiOperation(value = "enregistrer un candidat")
    public Candidat update(@Valid @RequestBody Candidat candidat){
        return candidatService.update(candidat);
    }


    @GetMapping(value = "/candidats/verification/{token}")
    @ApiOperation(value = "valider un candidat")
    public String validerCandidat(@PathVariable String token){
        return  candidatService.validateCandidat(token);
    }


    @PostMapping(value = "/candidats/{id}/cv")
    @ApiOperation(value = "enregistrer le cv d'un candidat")
    public  void enregisterCv(@PathVariable String id,@RequestParam("file") MultipartFile file) throws FileStorageException {
        fileStorageService.storeFile(file,id,CV_PATH);
    }

    @GetMapping(value = "/candidats/{id}/cv")
    @ApiOperation(value = "recuperer le cv d'un candidat")
    public  ResponseEntity<Resource> recupererCv(@PathVariable String id, HttpServletRequest request) throws FileStorageException {
        Resource resource = fileStorageService.retrieveFile(id,CV_PATH);
        return FileDownloadUtils.downloadResource(resource,request);
    }


    private String getBaseUrlFromRequest(HttpServletRequest request){
            return request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
    }

    @GetMapping(value = "/candidats")
    @ApiOperation(value = "rechercher tous les candidats")
    public List<Candidat> findAll(){
        return candidatService.findAll();
    }

}
