package com.hunter.job.services;

import com.hunter.job.domain.Entreprise;
import com.hunter.job.repositories.EntrepriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by telly on 28/01/18.
 */
@Service
public class EntrepriseService {

    @Autowired
    private EntrepriseRepository entrepriseRepository;

    public Entreprise obtenirEntreprise(Long id){
        return  this.entrepriseRepository.findOne(id);
    }

    public void addEntreprise(Entreprise e){
        this.entrepriseRepository.save(e);
    }
}
