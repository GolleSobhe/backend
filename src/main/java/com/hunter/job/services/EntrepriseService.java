package com.hunter.job.services;

import com.hunter.job.domain.Entreprise;
import com.hunter.job.domain.VerificationTokenCandidat;
import com.hunter.job.repositories.EntrepriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;


/**
 * Created by telly on 28/01/18.
 */
@Service
@Transactional
public class EntrepriseService {

    @Autowired
    EntrepriseRepository entrepriseRepository;

    public Entreprise save(Entreprise entreprise){

       return  entrepriseRepository.save(entreprise);
    }

    public List<Entreprise> findAll() {
        return entrepriseRepository.findAll();
    }

    public Entreprise findById(Long id){
        return entrepriseRepository.findById(id);
    }


    public Entreprise update(Entreprise entreprise) {
        return entrepriseRepository.update(entreprise);
    }



}
