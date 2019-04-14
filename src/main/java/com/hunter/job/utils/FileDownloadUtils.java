package com.hunter.job.utils;

import com.hunter.job.exception.FileStorageException;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class FileDownloadUtils {

   private FileDownloadUtils(){}

   public static ResponseEntity<Resource> downloadResource(Resource resource, HttpServletRequest request) throws FileStorageException{
       String contentType;
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
