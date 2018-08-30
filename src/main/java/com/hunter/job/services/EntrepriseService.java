package com.hunter.job.services;

import com.hunter.job.domain.Entreprise;
import com.hunter.job.repositories.EntrepriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by telly on 28/01/18.
 */
@Service
public class EntrepriseService {


    @Autowired
    private EntrepriseRepository entrepriseRepository;


    public List<Entreprise> findAll() {
        return entrepriseRepository.findAll();
    }

    public Entreprise save(Entreprise entreprise){
        return  entrepriseRepository.save(entreprise);
    }
}
