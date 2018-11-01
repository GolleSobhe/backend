package com.hunter.job.services;

import com.hunter.job.domain.Offre;
import com.hunter.job.repositories.OffreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OffreService {

    @Autowired
    private OffreRepository offreRepository;


    public Offre save(Offre offre){
        if(offre == null)
            throw new IllegalArgumentException("L'offre ne doit pas etre null");
       return offreRepository.save(offre);
    }

    public List<Offre> findOffres(){
        return offreRepository.findAll();
    }


    public Offre findById(Long offreId) {
        return offreRepository.findById(offreId);
    }
}
