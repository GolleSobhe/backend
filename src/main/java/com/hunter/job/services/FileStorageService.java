package com.hunter.job.services;

import com.hunter.job.exception.FileStorageException;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Optional;
import java.util.stream.Stream;

@Service
public class FileStorageService {

    public void storeFile(MultipartFile file,String id,String path) throws FileStorageException {
        if(file.isEmpty()){
            throw new FileStorageException("Impossible d'enregister un fichier vide");
        }
        try {
            String originalName = file.getOriginalFilename();
            int pos = originalName.lastIndexOf('.');
            String fileName = id+"."+originalName.substring(pos+1);
            InputStream inputStream = file.getInputStream();
            Path directoryPath =  Paths.get(path).toAbsolutePath().normalize();
            Path targetPath = directoryPath.resolve(fileName);
            Files.copy(inputStream,targetPath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new FileStorageException("Une exception a empeche l'enregistrement du fichier");
        }

    }

    public Resource retrieveFile(String id,String path) throws FileStorageException {
        Optional<Path> optPath = getPathById(id,path);
        if(!optPath.isPresent()){
            throw new FileStorageException("Le fichier n'existe pas");
        }
        Path targetPath = optPath.get();
        try {
            Resource resource = new UrlResource(targetPath.toUri());
            if(resource.exists()){
                return resource;
            } else{
                throw new FileStorageException("Le fichier n'existe pas");
            }
        } catch (MalformedURLException e) {
            throw new FileStorageException("Une exception a empeche la recuperation du fichier");
        }
    }

    Optional<Path> getPathById(String id,String path) throws FileStorageException{
        Path directory = Paths.get(path);
        try(Stream<Path> paths = Files.walk(directory)){
            return  paths.filter(f -> isCorrespondingFileToId(f,id)).findFirst();
        } catch (IOException e) {
            throw new FileStorageException("Une erreur s'est produite");
        }
    }

    private boolean isCorrespondingFileToId(Path file,String id){
        return file.toString().contains(id);
    }
}
