package com.hunter.job.controller;


import com.hunter.job.exception.FileStorageException;
import com.hunter.job.services.FileStorageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RestController
@RequestMapping("/api/v1")
@Api(description = "Controleur pour les CVs")
public class CvController {

    @Autowired
    private FileStorageService fileStorageService;

    @PostMapping(value = "/cvs/{id}")
    @ApiOperation(value = "enregistrer le cv d'un candidat")
    public  void enregisterCv(@PathVariable String id, @RequestParam("file") MultipartFile file) throws FileStorageException {
        String path = "./src/main/resources/cv";
        fileStorageService.storeFile(file,id,path);
    }

    @GetMapping(value = "/cvs/{id}")
    @ApiOperation(value = "recuperer le cv d'un candidat")
    public ResponseEntity<Resource> recupererCv(@PathVariable String id, HttpServletRequest request) throws FileStorageException {
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
}
