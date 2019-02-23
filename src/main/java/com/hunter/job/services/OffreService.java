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
            throw new IllegalArgumentException("L'offre ne doit pas etre nulle");
       return offreRepository.save(offre);
    }

    public List<Offre> findAll(){
        return offreRepository.findAll();
    }


    public Page<Offre> findByPage(Pageable pageable){
        return offreRepository.findByPage(pageable);
    }

    public Page<Offre> findByLieu(String lieu,Pageable pageable){
        return  offreRepository.findByLieu(lieu,pageable);
    }

    public Page<Offre> findByTitre(String titre,Pageable pageable){
        return  offreRepository.findByTitre(titre,pageable);
    }

    public Page<Offre> findByLieuAndTitre(String lieu,String titre,Pageable pageable){
        return  offreRepository.findByLieuAndTitre(lieu,titre,pageable);
    }

    public Offre findById(Long offreId) {
        return offreRepository.findById(offreId);
    }
}
