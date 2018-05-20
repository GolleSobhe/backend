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

    public Page<Offre> findOffreByPage(String pays,String ville,String titre,int numeroPage){
        Pageable pageable = new PageRequest(numeroPage,30);
        if(pays!=null && ville!=null && titre!=null)
            return offreRepository.findByPaysAndVilleAndTitreLike(pageable);
        if(pays!=null && ville!=null && titre==null)
            return offreRepository.findByPaysAndVille(pageable);
        if(pays!=null && ville==null && titre!=null)
            return offreRepository.findByPaysAndTitreLike(pageable);
        if(pays!=null && ville==null && titre==null)
            return offreRepository.findByPays(pageable);
        if(ville!=null && titre!=null)
            return offreRepository.findByVilleAndTitreLike(pageable);
        if(ville!=null)
            return offreRepository.findByVille(pageable);
        return offreRepository.findByTitreLike(pageable);
    }

}
