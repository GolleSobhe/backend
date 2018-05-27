package com.hunter.job.services;

import com.hunter.job.domain.Offre;
import com.hunter.job.repositories.OffreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class OffreService {

    @Autowired
    private OffreRepository offreRepository;


    public Offre createOffre(Offre offre){
        if(offre == null)
            throw new IllegalArgumentException("L'offre ne doit pas etre null");
        offreRepository.save(offre);
        return offre;
    }

    public Page<Offre> findOffres(String pays,String ville,String titre,int numeroPage){
        Pageable pageable = new PageRequest(numeroPage,30);
        if(pays == null && ville == null && titre == null)
            return offreRepository.findAll(pageable);
        if(pays!=null && ville!=null && titre!=null)
            return offreRepository.findByPaysAndVilleAndTitreIgnoreCaseContaining(pays,ville,titre,pageable);
        if(pays!=null && ville!=null && titre==null)
            return offreRepository.findByPaysAndVille(pays,ville,pageable);
        if(pays!=null && ville==null && titre!=null)
            return offreRepository.findByPaysAndTitreIgnoreCaseContaining(pays,titre,pageable);
        if(pays!=null && ville==null && titre==null)
            return offreRepository.findByPays(pays,pageable);
        if(ville!=null && titre!=null)
            return offreRepository.findByVilleAndTitreIgnoreCaseContaining(ville,titre,pageable);
        if(ville!=null)
            return offreRepository.findByVille(ville,pageable);
        return offreRepository.findByTitreIgnoreCaseContaining(titre,pageable);
    }

}
