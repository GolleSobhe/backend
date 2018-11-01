package com.hunter.job.services;

import com.hunter.job.domain.Entreprise;
import com.hunter.job.domain.Offre;
import com.hunter.job.domain.TypeContrat;
import com.hunter.job.dto.OffreDto;
import com.hunter.job.repositories.EntrepriseRepository;
import com.hunter.job.repositories.OffreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
        List<String> competences = new ArrayList<>();
        competences.add("Java");
        OffreDto dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);
        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);
        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);
    }
}
