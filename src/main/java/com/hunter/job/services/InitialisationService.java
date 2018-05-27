package com.hunter.job.services;

import com.hunter.job.domain.Entreprise;
import com.hunter.job.domain.Offre;
import com.hunter.job.repositories.EntrepriseRepository;
import com.hunter.job.repositories.OffreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by telly on 27/05/18.
 */
@Service
public class InitialisationService {

    @Autowired
    private OffreRepository offreRepository;
    @Autowired
    private EntrepriseRepository entrepriseRepository;

    private Entreprise cbg;
    private Entreprise seg;
    private Offre cbgInformaticien;
    private Offre segComptable;

    public void init(){
        initEntreprises();
        initOffres();
    }

    private void initEntreprises(){
        cbg = new Entreprise("Compagnie des bauxite de Guinee");
        seg = new Entreprise("Societe des Eaux de Guinee");
        entrepriseRepository.save(cbg);
        entrepriseRepository.save(seg);
    }

    private void initOffres(){
        cbgInformaticien = new Offre("Guinee","Conakry","Developpeur","coder",cbg);
        segComptable = new Offre("Guinee","Conakry","Comptable","gerer l'argent",seg);
        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);
    }
}
