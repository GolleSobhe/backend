package com.hunter.job.services;

import com.hunter.job.domain.Entreprise;
import com.hunter.job.domain.Offre;
import com.hunter.job.domain.TypeContrat;
import com.hunter.job.dto.EntrepriseDto;
import com.hunter.job.dto.OffreDto;
import com.hunter.job.repositories.EntrepriseRepository;
import com.hunter.job.repositories.OffreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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

    public void init(){
        initEntreprises();
        initOffres();
    }

    private void initEntreprises(){
        EntrepriseDto dto = new EntrepriseDto("CBG","62200000","pamelap","cbg@net.com",null,"compagnie de mines","mine");
        cbg = new Entreprise(dto);
        dto = new EntrepriseDto("SEG","62200000","Conakry","seg@net.com",null,"compagnie dee eaux","eaux");
        seg = new Entreprise(dto);
        entrepriseRepository.save(cbg);
        entrepriseRepository.save(seg);
    }

    private void initOffres(){
        List<String> competences = new ArrayList<>();
        competences.add("Java");
        OffreDto dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        Offre cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        Offre segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
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
