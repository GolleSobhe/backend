package com.hunter.job.services;

import com.hunter.job.domain.Entreprise;
import com.hunter.job.repositories.EntrepriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;


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
