package com.hunter.job.services;

import com.hunter.job.domain.Offre;
import com.hunter.job.repositories.OffreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OffreService {

    @Autowired
    private OffreRepository offreRepository;


    public Offre creerOffre(Offre offre){
        return this.offreRepository.save(offre);
    }

}
