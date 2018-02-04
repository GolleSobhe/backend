package com.hunter.job.services;

import com.hunter.job.domain.Entreprise;
import com.hunter.job.repositories.EntrepriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public Entreprise obtenirEntrepriseParId(Long id){
        return  this.entrepriseRepository.findOne(id);
    }

    public Entreprise creerEntreprise(Entreprise entreprise){
        return this.entrepriseRepository.save(entreprise);
    }

    public void supprimerEntreprise(Long id) {
        this.entrepriseRepository.delete(id);
    }

    public List<Entreprise> obtenirEntreprises() {
        List<Entreprise> entreprises = new ArrayList<Entreprise>();
        Iterator<Entreprise> iterator = this.entrepriseRepository.findAll().iterator();
        while (iterator.hasNext()) {
            entreprises.add(iterator.next());
        }
        return entreprises;
    }
}
